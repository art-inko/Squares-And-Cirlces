
package SquaresAndCirlces.Shapes;

import java.awt.Graphics;


public interface StrategyDrawable extends iFigure {
    
    void draw (Graphics g, iDrawStrategy drawStrategy);
    
}
