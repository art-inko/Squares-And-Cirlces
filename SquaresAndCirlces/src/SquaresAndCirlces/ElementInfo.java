package SquaresAndCirlces;

import SquaresAndCirlces.Shapes.iDrawStrategy;
import java.util.ArrayList;

public class ElementInfo {

    //==================== Переменные ===============
    private int X, Y;
    private int size;
    iDrawStrategy DrawStrategy;
    
    //==================== Геттеры и Сеттеры ========
    
    
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
}
