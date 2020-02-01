import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
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
    private ArrayList<Building> buildings;
    private OneBedroomApartment oba;
    private TwoBedroomApartment tba;
    private NuclearPowerPlant npp;
    private GeothermalPowerPlant gpp;
    private SolarPowerPlant spp;
    private CoalPowerPlant cpp;
    private DieselPowerPlant dpp;
    private WindPowerPlant wpp;
    private SolarThermalPowerPlant stpp;
 
    public CityComponent() {
        this.grid = new Grid();
        this.buildings = new ArrayList<>();
        
        oba = new OneBedroomApartment((80 * 1), (1080 - 80), 2);
        tba = new TwoBedroomApartment((80 * 2), (1080 - 80), 2);
        npp = new NuclearPowerPlant((80 * 3), (1080 - 80), 2);
        gpp = new GeothermalPowerPlant((80 * 4), (1080 - 80), 2);
        spp = new SolarPowerPlant((80 * 5), (1080 - 80), 2);
        cpp = new CoalPowerPlant((80 * 6), (1080 - 80), 2);
        dpp = new DieselPowerPlant((80 * 7), (1080 - 80), 2);
        wpp = new WindPowerPlant((80 * 8), (1080 - 80), 2);
        stpp = new SolarThermalPowerPlant((80 * 9), (1080 - 80), 2);
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        g2.setColor(new Color(34, 173, 12));
        g2.fill(new Rectangle2D.Double(0, 0, 1720, 1080));
        grid.draw(g2);
        g2.setColor(new Color(171, 193, 196));
        g2.fill(new Rectangle2D.Double(0, 1080 - 150, 1720, 150));
        oba.draw(g2);
        tba.draw(g2);
        npp.draw(g2);
        gpp.draw(g2);
        spp.draw(g2);
        cpp.draw(g2);
        dpp.draw(g2);
        wpp.draw(g2);
        stpp.draw(g2);
    }
    
    
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }
}
