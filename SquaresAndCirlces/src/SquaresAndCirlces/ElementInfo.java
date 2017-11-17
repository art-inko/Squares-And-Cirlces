package SquaresAndCirlces;

import SquaresAndCirlces.Shapes.iDrawStrategy;
import java.awt.Graphics;
import java.util.ArrayList;

public class ElementInfo {

    //==================== Переменные ===============
    private int X, Y;
    private int size;
    
    Graphics g;

    //==================== Геттеры и Сеттеры ========
    public void setDrawStrategy(iDrawStrategy DrawStrategy) {
        this.drawStrategy = DrawStrategy;
    }
    
    public void setInfo(int X, int Y, int size) {
        
        this.X = X;
        this.Y = Y;
        this.size = size;
    }
    
    public int getX() {
        return X;
    }
    
    public int getY() {
        return Y;
    }
    
    public int getSize() {
        return size;
    }
    
    public void draw() {
       drawStrategy.draw(g, X, Y, size);
    }
    
}
