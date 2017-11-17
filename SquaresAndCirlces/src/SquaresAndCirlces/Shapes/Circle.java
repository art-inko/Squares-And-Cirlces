package SquaresAndCirlces.Shapes;

import java.awt.Graphics;

public class Circle implements iDrawStrategy {

    @Override
    public void draw(Graphics g, int X, int Y, int size) {
        g.fillOval(X - size / 2, Y - size / 2, size, size);
    }
}
