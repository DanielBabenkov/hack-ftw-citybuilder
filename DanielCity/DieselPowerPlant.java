import java.awt.Color;
import java.awt.Rectangle;
import java.awt.BasicStroke;
import java.awt.Graphics2D;

/**
 * A Diesel Power Plant
 *
 * @author DanielBabenkov
 * @version 1 February 2020
 */
public class DieselPowerPlant extends Building
{
    private static final long DAILY_PRODUCTION_IN_MWH = 30000;
    private static final long COST_PER_MWH = 60;
    private static final double EMISSIONS_PER_MWH = 0.49;
    
    public DieselPowerPlant(int leftX, int bottomY, int type) {
        super(0, DAILY_PRODUCTION_IN_MWH, EMISSIONS_PER_MWH, COST_PER_MWH, bottomY, leftX, 40, 40, type);
    }
    public void draw(Graphics2D g2) {
        g2.setColor(Color.DARK_GRAY);
        Rectangle plant = new Rectangle(getBottomY() - 20, getLeftX(), getWidth(), getHeight());
        g2.fill(plant);
    }
}
