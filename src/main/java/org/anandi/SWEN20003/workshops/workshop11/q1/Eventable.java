package org.anandi.SWEN20003.workshops.workshop11.q1;

import bagel.Input;
import bagel.Keys;
import bagel.MouseButtons;
import bagel.util.Point;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public abstract class Eventable {
    private final Map<Event, Consumer<String>> callbacks = new HashMap<>();

    public final Point topLeft;
    private final double width;
    private final double height;

    private boolean focused = false;

    public Eventable(Point topLeft, double width, double height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    private void handleEvent(Event event, String arg) {
        if (callbacks.containsKey(event)) {
            callbacks.get(event).accept(arg);
        }
    }

    public void addEventHandler(Event event, Consumer<String> callback) {
        callbacks.put(event, callback);
    }

    public final void update(Input input) {
        if (input.isDown(MouseButtons.LEFT)) {
            double mx = input.getMouseX();
            double my = input.getMouseY();
            if (mx >= topLeft.x && mx <= topLeft.x + width && my >= topLeft.y && my <= topLeft.y + height) {
                handleEvent(Event.OnClick, null);
                focused = true;
            } else {
                focused = false;
            }
        }

        if (input.wasPressed(Keys.ENTER) && focused) {
            handleEvent(Event.OnSubmit, null);
        }

        Map<Keys, Character> chars = new HashMap<>();
        chars.put(Keys.A, 'a');
        chars.put(Keys.B, 'b');
        chars.put(Keys.C, 'c');
        chars.put(Keys.D, 'd');
        chars.put(Keys.E, 'e');
        chars.put(Keys.F, 'f');
        chars.put(Keys.G, 'g');
        chars.put(Keys.H, 'h');
        chars.put(Keys.I, 'i');
        chars.put(Keys.J, 'j');
        chars.put(Keys.K, 'k');
        chars.put(Keys.L, 'l');
        chars.put(Keys.M, 'm');
        chars.put(Keys.N, 'n');
        chars.put(Keys.O, 'o');
        chars.put(Keys.P, 'p');
        chars.put(Keys.Q, 'q');
        chars.put(Keys.R, 'r');
        chars.put(Keys.S, 's');
        chars.put(Keys.T, 't');
        chars.put(Keys.U, 'u');
        chars.put(Keys.V, 'v');
        chars.put(Keys.W, 'w');
        chars.put(Keys.X, 'x');
        chars.put(Keys.Y, 'y');
        chars.put(Keys.Z, 'z');
        chars.put(Keys.SPACE, ' ');

        for (Map.Entry<Keys, Character> entry : chars.entrySet()) {
            if (input.wasPressed(entry.getKey()) && focused) {
                handleEvent(Event.OnInput, String.valueOf(entry.getValue()));
            }
        }

        draw();
    }

    public abstract void draw();
}
