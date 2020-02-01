import javax.swing.JFrame;
/**
 * Viewer for the City
 *
 * @author DanielBabenkov
 * @version 1 February 2020
 */
public class CityViewer
{
    public static final int WIDTH = 1720; // 86 squares
    public static final int HEIGHT = 1080;// 54 squares
    /**
     * main method for the program which creates and configures the frame for the program
     * 
     * @param args  not used
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        frame.setSize(WIDTH, HEIGHT);
        frame.setTitle("City");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
        CityComponent component = new CityComponent();
        frame.add(component);
        while(true)
        {   
            component.nextFrame();
            Thread.sleep(100);
        }
    }
}