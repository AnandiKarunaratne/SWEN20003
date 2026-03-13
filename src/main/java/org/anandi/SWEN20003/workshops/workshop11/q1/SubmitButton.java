package org.anandi.SWEN20003.workshops.workshop11.q1;

import bagel.DrawOptions;
import bagel.Font;
import bagel.Image;
import bagel.util.Colour;
import bagel.util.Point;

public class SubmitButton extends Eventable {
    private static final Image image = new Image("res/button.png");
    private static final Font font = new Font("res/VeraMono.ttf", 24);
    private static final int TEXT_OFFSET = 50;

    public SubmitButton(Point topLeft, TextField textField) {
        super(topLeft, image.getWidth(), image.getHeight());
        this.addEventHandler(Event.OnClick, __ -> textField.onSubmit());

        /* new Consumer<String>() {
                public void accept(String text) {
                    textField.onSubmit();
                }
            }
         */
    }


    @Override
    public void draw() {
        image.drawFromTopLeft(this.topLeft.x, this.topLeft.y);

        DrawOptions opts = new DrawOptions().setBlendColour(Colour.BLACK);
        font.drawString("Submit", this.topLeft.x + TEXT_OFFSET, this.topLeft.y + image.getHeight() / 2, opts);
    }
}
