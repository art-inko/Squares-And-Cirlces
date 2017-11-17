package SquaresAndCirlces.Shapes;

import java.awt.Graphics;

public class Square implements iDrawStrategy {

    @Override
    public void draw(Graphics g, int X, int Y, int size) {
        g.fillRect(X - size / 2, Y - size / 2, size, size);
    }

}
