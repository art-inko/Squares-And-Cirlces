package SquaresAndCirlces;

import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class MyJFrame extends javax.swing.JFrame {

    public MyJFrame() {

        initComponents();
        addListeners();
        buttonGroup1.add(squareJRadioButton);
        buttonGroup1.add(circleJRadioButton);
        squareJRadioButton.setSelected(true);
        System.out.println(sizeSlider.getValue());
        currentSize = 25;
        sizeTextField.setText(new Integer(currentSize).toString());
        drawingPanel.setCurrentSize(currentSize);
        currentShape = getSelectedButtonText(buttonGroup1);
        drawingPanel.setCurrentShape(currentShape);
        drawingPanel.setCanWeDraw(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        squareJRadioButton = new javax.swing.JRadioButton();
        circleJRadioButton = new javax.swing.JRadioButton();
        clearButton = new javax.swing.JButton();
        sizeSlider = new javax.swing.JSlider();
        printArrayButton = new javax.swing.JButton();
        sizeTextField = new javax.swing.JTextField();
        colorComboBox = new javax.swing.JComboBox<>();
        drawingCheckBox = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        drawingPanel = new SquaresAndCirlces.DrawingPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        squareJRadioButton.setText("Квадрат");
        squareJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareJRadioButtonActionPerformed(evt);
            }
        });

        circleJRadioButton.setText("Круг");
        circleJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleJRadioButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Сброс");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        sizeSlider.setMajorTickSpacing(10);
        sizeSlider.setMinimum(10);
        sizeSlider.setMinorTickSpacing(1);
        sizeSlider.setPaintTicks(true);
        sizeSlider.setToolTipText("");
        sizeSlider.setValue(25);
        sizeSlider.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        sizeSlider.setDoubleBuffered(true);
        sizeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sizeSliderStateChanged(evt);
            }
        });

        printArrayButton.setText("Печатать массив");
        printArrayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printArrayButtonActionPerformed(evt);
            }
        });

        sizeTextField.setText("размер");

        colorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Синий", "Желтый ", "Красный", "Зеленый" }));
        colorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorComboBoxActionPerformed(evt);
            }
        });

        drawingCheckBox.setText("Режим Рисования");
        drawingCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawingCheckBoxActionPerformed(evt);
            }
        });

        jButton1.setText("Печатать рисовальный массив");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        drawingPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout drawingPanelLayout = new javax.swing.GroupLayout(drawingPanel);
        drawingPanel.setLayout(drawingPanelLayout);
        drawingPanelLayout.setHorizontalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
        );
        drawingPanelLayout.setVerticalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(drawingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drawingCheckBox)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(squareJRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(circleJRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(colorComboBox, 0, 155, Short.MAX_VALUE)))
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sizeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clearButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(printArrayButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(squareJRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(circleJRadioButton)
                        .addGap(44, 44, 44)
                        .addComponent(sizeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(colorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                        .addComponent(drawingCheckBox)
                        .addGap(68, 68, 68)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printArrayButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(drawingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printArrayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printArrayButtonActionPerformed

        ArrayList<ElementInfo> temp = drawingPanel.getElementsInfo();
        for (int i = 0; i < temp.size(); i++) {
            System.out.println(i + ". X = " + temp.get(i).getX());
            System.out.println(i + ". Y = " + temp.get(i).getY());
        }

    }//GEN-LAST:event_printArrayButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        drawingPanel.getElementsInfo().clear();
        drawingPanel.repaint();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void sizeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sizeSliderStateChanged
        int size = sizeSlider.getValue();
        sizeTextField.setText(new Integer(size).toString());
        drawingPanel.setCurrentSize(size);
    }//GEN-LAST:event_sizeSliderStateChanged

    private void squareJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareJRadioButtonActionPerformed
        radioButtonStateChanged();
    }//GEN-LAST:event_squareJRadioButtonActionPerformed

    private void circleJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleJRadioButtonActionPerformed
        radioButtonStateChanged();
    }//GEN-LAST:event_circleJRadioButtonActionPerformed

    private void colorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorComboBoxActionPerformed
        drawingPanel.changeColor(colorComboBox.getSelectedIndex());
    }//GEN-LAST:event_colorComboBoxActionPerformed

    private void drawingCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawingCheckBoxActionPerformed
        drawingPanel.setCanWeDraw(drawingCheckBox.isSelected());
    }//GEN-LAST:event_drawingCheckBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

//        ArrayList<ElementInfo> temp = drawingPanel.getElementsInfo();
//        for (int i = 0; i < temp.size(); i++) {
//            System.out.println(i + ". X = " + temp.get(i).getX());
//            System.out.println(i + ". Y = " + temp.get(i).getY());
//        }



//        ElementInfo temp = new ElementInfo();
//        temp = drawingPanel.getCurrentDrawingElementInfo();
//        ArrayList<ElementInfo.Coordinate> tempArray = new ArrayList();
//        tempArray = temp.getDrawingCoordinates();
//
//        for (int i = 0; i < tempArray.size(); i++) {
//            System.out.println(i + ". X = " + tempArray.get(i).getArrayX());
//            System.out.println(i + ". Y = " + tempArray.get(i).getArrayY());
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton circleJRadioButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<String> colorComboBox;
    private javax.swing.JCheckBox drawingCheckBox;
    private SquaresAndCirlces.DrawingPanel drawingPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton printArrayButton;
    private javax.swing.JSlider sizeSlider;
    private javax.swing.JTextField sizeTextField;
    private javax.swing.JRadioButton squareJRadioButton;
    // End of variables declaration//GEN-END:variables

    // ============= Мои переменные ===============
    int currentSize;
    String currentShape;
    boolean canWeDraw;
    // ============= Мои методы ===================

    void addListeners() {
        drawingPanel.addMouseListener(drawingPanel);
        drawingPanel.addMouseMotionListener(drawingPanel);
    }

    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }

    public void radioButtonStateChanged() {
        currentShape = getSelectedButtonText(buttonGroup1);
        System.out.println(currentShape);
        drawingPanel.setCurrentShape(currentShape);
        System.out.println(currentShape);
        drawingPanel.repaint();
    }

}
