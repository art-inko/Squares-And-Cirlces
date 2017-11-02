package SquaresAndCirlces;

import java.util.ArrayList;

public class ElementInfo {

    //==================== Переменные ===============
    private int X, Y;
    private int size;
    private ArrayList<Coordinate> drawingCoordinates = new ArrayList<Coordinate>();

    //==================== Геттеры и Сеттеры ========
//
//    public void setX(int X) {
//        this.X = X;
//    }
//
//    public void setY(int Y) {
//        this.Y = Y;
//    }
//
//    public void setSize(int size) {
//        this.size = size;
//    }
    
    
    
    
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

    public ArrayList getDrawingCoordinates() {
        return drawingCoordinates;
    }

    public void setDrawingCoordinates(ArrayList drawingCoordinates) {
        this.drawingCoordinates = drawingCoordinates;
    }

    class Coordinate {

        public Coordinate(int arrayX, int arrayY) {
            this.arrayX = arrayX;
            this.arrayY = arrayY;
        }

        int arrayX, arrayY;

        public int getArrayX() {
            return arrayX;
        }

        public void setArrayX(int arrayX) {
            this.arrayX = arrayX;
        }

        public int getArrayY() {
            return arrayY;
        }

        public void setArrayY(int arrayY) {
            this.arrayY = arrayY;
        }

    }

}
