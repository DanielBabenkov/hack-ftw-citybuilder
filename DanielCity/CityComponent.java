import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Rectangle2D;
/**
 * Component for City
 *
 * @author DanielBabenkov
 * @version 1 February 2020
 */
public class CityComponent extends JComponent
{
    // instance variable for everything 
    private Grid grid;
    public CityComponent() {
        this.grid = new Grid();
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        g2.setColor(new Color(34, 173, 12));
        g2.fill(new Rectangle2D.Double(0, 0, 1720, 1080));
        grid.draw(g2);
    }
    
    
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }
}
