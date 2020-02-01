import java.awt.Color;
import java.awt.Rectangle;
import java.awt.BasicStroke;
import java.awt.Graphics2D;

/**
 * A Nuclear Power Plant
 *
 * @author DanielBabenkov
 * @version 1 February 2020
 */
public class GeothermalPowerPlant extends Building
{
    private static final int DAILY_PRODUCTION_IN_MWH = 13000;
    private static final int COST_PER_MWH = 50;
    private static final double EMISSIONS_PER_MWH = 0.0057;
    
    public int getProduction() {
        return DAILY_PRODUCTION_IN_MWH;
    }
    public int getCost() {
        return COST_PER_MWH;
    }
    public int getDailyCost() {
        return COST_PER_MWH * DAILY_PRODUCTION_IN_MWH;
    }
    public double getEmissions(){
        return EMISSIONS_PER_MWH;
    }
}
