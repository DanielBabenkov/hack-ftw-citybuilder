import java.awt.Color;
import java.awt.Rectangle;
import java.awt.BasicStroke;
import java.awt.Graphics2D;

/**
 * An Apartment
 *
 * @author DanielBabenkov
 * @version 1 February 2020
 */
public class OneBedroomApartment extends Building
{
    private static final long ENERGY_CONSUMPTION = 160;
    private static final long EMISSIONS_PER_MWH = 1500;
    public OneBedroomApartment(int leftX, int bottomY) {
        super(ENERGY_CONSUMPTION, 0, EMISSIONS_PER_MWH, 0, bottomY, leftX, 20, 20);
    }
    public void draw(Graphics2D g2) {
        Color brick = new Color(173, 76, 12);
        g2.setColor(brick);
        Rectangle house = new Rectangle(getBottomY() - 20, getLeftX(), getWidth(), getHeight());
        g2.fill(house);
    }
    public String getName() {
        return "One Bedroom Apartments(10)";
    }
}
