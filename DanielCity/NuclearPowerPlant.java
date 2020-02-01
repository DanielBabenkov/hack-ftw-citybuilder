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
public class NuclearPowerPlant extends Building
{
    private static final long DAILY_PRODUCTION_IN_MWH = 77000;
    private static final long DAILY_CONSUMPTION_IN_MWH = 50000;
    private static final long COST_PER_MWH = 35;
    private static final double EMISSIONS_PER_MWH = 0.1;
    
    public NuclearPowerPlant(int leftX, int bottomY) {
        super(DAILY_CONSUMPTION_IN_MWH, DAILY_PRODUCTION_IN_MWH, EMISSIONS_PER_MWH, COST_PER_MWH, bottomY, leftX, 40, 40);
    }
    public void draw(Graphics2D g2) {
        g2.setColor(Color.YELLOW);
        Rectangle plant = new Rectangle(getBottomY() - 20, getLeftX(), getWidth(), getHeight());
        g2.fill(plant);
    }
    public String getName() {
        return "Nuclear Power Plant";
    }
}
