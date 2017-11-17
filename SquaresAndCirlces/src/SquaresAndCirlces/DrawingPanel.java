package SquaresAndCirlces;

import SquaresAndCirlces.Shapes.Square;
import SquaresAndCirlces.Shapes.iDrawStrategy;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class DrawingPanel extends javax.swing.JPanel implements MouseListener {

    int X, Y;
    private ArrayList<ElementInfo> elementsInfo = new ArrayList();
    private String currentShape;
    private int currentSize;
    private Color myColor = Color.BLUE;
    private boolean canWeDraw = false;
    private ElementInfo currentDrawingElementInfo = new ElementInfo();
    private iDrawStrategy drawStrategy = new Square();

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

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        ElementInfo currentElementInfo = new ElementInfo();
        currentElementInfo.setInfo(e.getX(), e.getY(), currentSize);
        elementsInfo.add(currentElementInfo);
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
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

    public ArrayList<ElementInfo> getElementsInfo() {
        return elementsInfo;
    }

    public void setCurrentShape(String currentShape) {
        this.currentShape = currentShape;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(myColor);

        for (int i = 0; i < elementsInfo.size(); i++) {

            drawStrategy.draw(g, elementsInfo.get(i).getX(), elementsInfo.get(i).getY(), elementsInfo.get(i).getSize());

//            if (currentShape.equals("Квадрат")) {
//                g.fillRect(elementsInfo.get(i).getX() - elementsInfo.get(i).getSize() / 2, elementsInfo.get(i).getY() - elementsInfo.get(i).getSize() / 2, elementsInfo.get(i).getSize(), elementsInfo.get(i).getSize());
//            } else {
//                g.fillOval(elementsInfo.get(i).getX() - elementsInfo.get(i).getSize() / 2, elementsInfo.get(i).getY() - elementsInfo.get(i).getSize() / 2, elementsInfo.get(i).getSize(), elementsInfo.get(i).getSize());
//            }
        }

    }

    public void setDrawStrategy(iDrawStrategy drawStrategy) {
        this.drawStrategy = drawStrategy;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
