import java.awt.Color;
import java.awt.Rectangle;
import java.awt.BasicStroke;
import java.awt.Graphics2D;

/**
 * A road
 *
 * @author DanielBabenkov
 * @version 1 February 2020
 */
public class Road extends Building
{
    public Road(int leftX, int bottomY) {
        super(0, 0, 0, 0, bottomY, leftX, 20, 20);
    }
    public void draw(Graphics2D g2) {
        g2.setColor(Color.DARK_GRAY);
        Rectangle house = new Rectangle(getBottomY() - 20, getLeftX(), getWidth(), getHeight());
        g2.fill(house);
    }
    public String getName() {
        return "Road";
    }
}
