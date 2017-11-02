package SquaresAndCirlces;

import SquaresAndCirlces.ElementInfo.Coordinate;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class DrawingPanel extends javax.swing.JPanel implements MouseListener, MouseMotionListener {

    // ============ Переменные ===============
    int X, Y;
    private ArrayList<ElementInfo> elementsInfo = new ArrayList();
    private String currentShape;
    private int currentSize;
    private Color myColor = Color.BLUE;
    private boolean canWeDraw = false;
    private ElementInfo currentDrawingElementInfo = new ElementInfo();
    private ArrayList currentDrawingCoordinates = new ArrayList();

// ============ Конструктор =============
    public DrawingPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    // ============ Методы ===================
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.setColor(myColor);
//            ArrayList<Coordinate> temp = new ArrayList();
        for (int i = 0; i < elementsInfo.size(); i++) {
//            temp = elementsInfo.get(i).getDrawingCoordinates();

            if (currentShape.equals("Квадрат")) {
                g.fillRect(elementsInfo.get(i).getX() - elementsInfo.get(i).getSize() / 2, elementsInfo.get(i).getY() - elementsInfo.get(i).getSize() / 2, elementsInfo.get(i).getSize(), elementsInfo.get(i).getSize());
//                g.fillRect(temp.get(i).arrayX, temp.get(i).arrayX, elementsInfo.get(i).getSize(), elementsInfo.get(i).getSize());
            } else {
                g.fillOval(elementsInfo.get(i).getX() - elementsInfo.get(i).getSize() / 2, elementsInfo.get(i).getY() - elementsInfo.get(i).getSize() / 2, elementsInfo.get(i).getSize(), elementsInfo.get(i).getSize());
            }
        }

//        g.fillRect(X, Y, 50, 50);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

        if (!canWeDraw) {
            ElementInfo currentElementInfo = new ElementInfo();
            currentElementInfo.setInfo(e.getX(), e.getY(), currentSize);
            elementsInfo.add(currentElementInfo);
            repaint();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (!canWeDraw) {
            currentDrawingElementInfo.setDrawingCoordinates(currentDrawingCoordinates);
            elementsInfo.add(currentDrawingElementInfo);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e
    ) {
    }

    @Override
    public void mouseExited(MouseEvent e
    ) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (canWeDraw) {
            ElementInfo.Coordinate coordinate = currentDrawingElementInfo.new Coordinate(e.getX(), e.getY());
            System.out.println("X = " + coordinate.getArrayX());
            System.out.println("Y = " + coordinate.getArrayY());
            currentDrawingCoordinates.add(coordinate);
//                currentElementInfo.drawingCoordinates.add(new Coordinate(arrayX.set(, arrayY.set(e.getY()))));

        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    public void changeColor(int x) {

        switch (x) {
            case 0:
                myColor = Color.BLUE;
                break;
            case 1:
                myColor = Color.YELLOW;
                break;
            case 2:
                myColor = Color.RED;
                break;
            case 3:
                myColor = Color.GREEN;
                break;
            default:
                myColor = Color.BLUE;
        }
        repaint();
    }

    // ============ Геттеры и Сеттеры =======
//    public int getX() {
//        return X;
//    }
//
//    public void setX(int X) {
//        this.X = X;
//    }
//
    //          КАК ТАК!!!!??? Почему не работает с обычными геттерами и сеттерами?
    //
//    public int getY() {
//        return Y;
//    }
//
//    public void setY(int Y) {
//        this.Y = Y;
//    }
    public String getCurrentShape() {
        return currentShape;
    }

    public void setCurrentShape(String currentShape) {
        this.currentShape = currentShape;
    }

    public ArrayList<ElementInfo> getElementsInfo() {
        return elementsInfo;
    }

    public void setElementsInfo(ArrayList<ElementInfo> elementsInfo) {
        this.elementsInfo = elementsInfo;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public boolean isCanWeDraw() {
        return canWeDraw;
    }

    public void setCanWeDraw(boolean canWeDraw) {
        this.canWeDraw = canWeDraw;
    }

    public ElementInfo getCurrentDrawingElementInfo() {
        return currentDrawingElementInfo;
    }

    public void setCurrentDrawingElementInfo(ElementInfo currentDrawingElementInfo) {
        this.currentDrawingElementInfo = currentDrawingElementInfo;
    }

    public ArrayList getCurrentDrawingCoordinates() {
        return currentDrawingCoordinates;
    }

    public void setCurrentDrawingCoordinates(ArrayList currentDrawingCoordinates) {
        this.currentDrawingCoordinates = currentDrawingCoordinates;
    }

}
