package org.anandi.SWEN20003.workshops.workshop11.q1;

import bagel.AbstractGame;
import bagel.Input;
import bagel.util.Point;

import java.util.ArrayList;
import java.util.List;

public class Program extends AbstractGame {
    private final List<Eventable> controls = new ArrayList<>();

    public Program() {
        TextField textField = new TextField(new Point(300, 300));
        controls.add(textField);
        controls.add(new SubmitButton(new Point(350, 400), textField));
    }

    @Override
    protected void update(Input input) {
        controls.forEach(control -> control.update(input));
    }

    public static void main(String[] args) {
        new Program().run();
    }

    // Consumer<String> consumer = new Consumer<String> () {
    //      void accept(String text) {
    //          how to behave when the event occurs
    //      }
    //  }
    // addEventHandler(event, consumer)

    // addEventHandler(event, text -> what to do)
}
