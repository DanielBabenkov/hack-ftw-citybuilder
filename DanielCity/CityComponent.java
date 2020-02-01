import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Component for City
 *
 * @author DanielBabenkov
 * @version 1 February 2020
 */
public class CityComponent extends JComponent
{
    // instance variable for everything 

    public CityComponent() {
        
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        
        
        // invoke the draw method on each object in your City
        
    }
    
    
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        
        
        // request that the Java Runtime repaints this component by invoking
        //  its paintComponent method. Do not explicitly invoke the paintComponent method
        repaint();
    }
}
