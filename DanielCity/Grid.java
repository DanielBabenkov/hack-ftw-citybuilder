import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
/**
 * Write a description of class Grid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Grid
{
    /**
     * A 86x54 grid filled with 20x20 pixel squares.
     */
    public void draw(Graphics2D g2)
    {
        Color initColor = g2.getColor();
        g2.setColor(Color.black);
        for(int i = 20; i < 1720; i+=20) {
            g2.draw(new Line2D.Double(i, 0, i, 720));
        }
        for(int i = 20; i < 740; i+=20) {
            g2.draw(new Line2D.Double(0, i, 1720, i));
        }
        // Reset g2 to initial color to minimize side effects of method
        g2.setColor(initColor);
    }
}
