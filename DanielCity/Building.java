import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
/**
 * Write a description of class Building here.
 *
 * @author wjwoker
 * @version 10/3/18
 */
public abstract class Building
{
    private long energyConsumption;
    private int bottomY;
    private int leftX;  
    public Building()
    {
        this.energyConsumption = 0;
        this.bottomY = 0;
        this.leftX = 0;
    }
    
    public Building(long energyConsumption, int bottomY, int leftX) {
        this.energyConsumption = energyConsumption;
        this.bottomY = bottomY;
        this.leftX = leftX;
    }
    
    public long getEnergyConsumption() {
        return this.energyConsumption;
    }
    
    public int getBottomY() {
        return this.bottomY;
    }
    
    public void setBottomY(int newY) {
        this.bottomY = newY;
    }
    
    public int getLeftX()
    {
        return this.leftX;
    }
    
    public void setLeftX(int newX) {
        this.leftX = newX;
    }
    
    /**
     * Draws a Building.
     * 
     * @param g2 the Graphics2D object to draw on
     */
    public abstract void draw(Graphics2D g2);
}

