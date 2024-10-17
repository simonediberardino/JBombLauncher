package presentation.components;

import values.BomberColors;

import java.awt.*;

public class RedButton extends BombermanButton {
    public RedButton(String text) {
        super(text);
    }

    public RedButton(String text, int fontSize) {
        super(text, fontSize);
    }

    @Override
    public Color getBorderColor() {
        return BomberColors.RED;
    }

    @Override
    public Color getMouseHoverBackgroundColor() {
        return Color.RED;
    }
}
