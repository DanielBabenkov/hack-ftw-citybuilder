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
    private long energyProduction;
    private double emissions;
    private long costPerMWH;
    private int width;
    private int height;
    private int bottomY;
    private int leftX;
    private int type;
    public Building()
    {
        this.energyConsumption = 0;
        this.energyProduction = 0;
        this.costPerMWH = 0;
        this.bottomY = 0;
        this.leftX = 0;
        this.width = 0;
        this.height = 0;
    }

    public Building(long energyConsumption, long energyProduction, double emissions,
                    long costPerMWH, int bottomY, int leftX, int width, int height, int type) {
        this.energyConsumption = energyConsumption;
        this.energyProduction = energyProduction;
        this.costPerMWH = costPerMWH;
        this.bottomY = bottomY;
        this.leftX = leftX;
        this.width = width;
        this.height = height;
        this.type = type;
    }

    public int getType() {
        return this.type;
    }
    
    public long getEnergyConsumption() {
        return this.energyConsumption;
    }

    public long getEnergyProduction() {
        return this.energyProduction;
    }
    
    public double getEmissions() {
        return this.emissions;
    }
    
    public long getCostPerMWH() {
        return this.costPerMWH;
    }
    public long getDailyCost() {
        return this.costPerMWH * this.energyProduction;
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
    
    public int getHeight() {
        return this.height;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    /**
     * Draws a Building.
     * 
     * @param g2 the Graphics2D object to draw on
     */
    public abstract void draw(Graphics2D g2);
}

