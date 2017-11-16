
package SquaresAndCirlces.Shapes;


public class Circle implements iFigure {

    @Override
    public void draw() {
       g.fillOval(elementsInfo.get(i).getX() - elementsInfo.get(i).getSize() / 2, elementsInfo.get(i).getY() - elementsInfo.get(i).getSize() / 2, elementsInfo.get(i).getSize(), elementsInfo.get(i).getSize());
            }
    
}
