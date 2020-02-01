import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;

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
        this.buildings = new ArrayList<Building>();
        
        oba = new OneBedroomApartment((740), (80), 2);
        tba = new TwoBedroomApartment((740), (240), 2);
        npp = new NuclearPowerPlant((740), (400), 2);
        gpp = new GeothermalPowerPlant((740), (560), 2);
        spp = new SolarPowerPlant((740), (720), 2);
        cpp = new CoalPowerPlant((740), (880), 2);
        dpp = new DieselPowerPlant((740), (1040), 2);
        wpp = new WindPowerPlant((740), (1200), 2);
        stpp = new SolarThermalPowerPlant((740), (1360), 2);

        MouseListen listener = new MouseListen();
    }

    public class MouseListen implements MouseListener, MouseMotionListener
    {
        public void mousePressed(MouseEvent event)
        {
            requestFocusInWindow();
            Point2D.Double point = new Point2D.Double(event.getX(), event.getY());
        }

        public void mouseClicked(MouseEvent event)
        {

        }

        public void mouseExited(MouseEvent event)
        {

        }

        public void mouseEntered(MouseEvent event)
        {

        }

        public void mouseMoved(MouseEvent event)
        {

        }

        public void mouseReleased(MouseEvent event)
        {

        }

        public void mouseDragged(MouseEvent event)
        {

        }
    }

    public long getTotalConsumption()
    {
        long totalConsumption = 0;
        for (Building building: buildings)
        {
            totalConsumption += (building.getEnergyConsumption() - building.getEnergyProduction());
        }
        return totalConsumption;
    }

    public double getTotalEmission()
    {
        double totalEmission = 0;
        for (Building building: buildings)
        {
            totalEmission += building.getEmissions();
        }
        return totalEmission;
    }

    public long getTotalDailyCost()
    {
        long totalDailyCost = 0;
        for (Building building: buildings)
        {
            totalDailyCost += building.getDailyCost();
        }
        return totalDailyCost;
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
