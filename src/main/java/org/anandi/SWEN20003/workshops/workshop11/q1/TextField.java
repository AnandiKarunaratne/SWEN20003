package org.anandi.SWEN20003.workshops.workshop11.q1;

import bagel.DrawOptions;
import bagel.Font;
import bagel.Image;
import bagel.util.Colour;
import bagel.util.Point;

public class TextField extends Eventable {
    private static final Image image = new Image("res/text.png");
    private static final Font font = new Font("res/VeraMono.ttf", 36);

    private String contents = "";

    public TextField(Point topLeft) {
        super(topLeft, image.getWidth(), image.getHeight());
        this.addEventHandler(Event.OnInput, text -> contents += text);
        this.addEventHandler(Event.OnSubmit, __ -> onSubmit());

        /* new Consumer<String>() {
                public void accept(String text) {
                    contents += text;
                }
            }
         */
    }

    public void onSubmit() {
        System.out.println("Input: " + contents);
        System.exit(0);
    }

    @Override
    public void draw() {
        image.drawFromTopLeft(this.topLeft.x, this.topLeft.y);

        DrawOptions opts = new DrawOptions().setBlendColour(Colour.BLACK);
        font.drawString(contents, this.topLeft.x, this.topLeft.y + image.getHeight() / 2, opts);
    }


}
