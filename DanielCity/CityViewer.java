import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
/**
 * Viewer for the City
 *
 * @author DanielBabenkov
 * @version 1 February 2020
 */
public class CityViewer
{
    public static final int WIDTH = 1420;
    public static final int HEIGHT = 700;
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
        JPanel background = new JPanel();
        background.setBackground(Color.blue);
        CityComponent component = new CityComponent();
        component.add(background);
        frame.add(component);
        /*
        CityCalculations calculations = new CityCalculations();
        calculations.update();
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(calculations, BorderLayout.NORTH);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(topPanel, BorderLayout.LINE_END);

        frame.getContentPane().add(mainPanel);
        frame.pack();
        */
        frame.setSize(WIDTH, HEIGHT);
        frame.setTitle("City");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        /*
        for(int seconds = 0; seconds < 60; seconds++ )
        {
            calculations.nextFrame();
            Thread.sleep(100);
        }
        */
    }
}