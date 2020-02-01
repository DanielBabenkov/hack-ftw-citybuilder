import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import java.awt.Color;


public class CityCalculations extends JPanel
{
    private JLabel consumption;
    private JLabel production;
    private JLabel emissions;
    private JLabel dailyCost;

    public CityCalculations()
    {
        this.setPreferredSize(new Dimension(200,200));
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        this.setBackground(Color.white);
        
        this.consumption = new JLabel("Consumption: 0");
        this.production = new JLabel("Production: 0");
        this.emissions = new JLabel("Emissions: 0");
        this.dailyCost = new JLabel("Daily Cost: 0");

        this.consumption.setAlignmentX(CENTER_ALIGNMENT);
        this.production.setAlignmentX(CENTER_ALIGNMENT);
        this.emissions.setAlignmentX(CENTER_ALIGNMENT);
        this.dailyCost.setAlignmentX(CENTER_ALIGNMENT);
    }

    public void update()
    {
        
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(this.consumption);
        this.add(Box.createRigidArea(new Dimension(0,10)));
        this.add(this.production);
        this.add(Box.createRigidArea(new Dimension(0,10)));
        this.add(this.emissions);
        this.add(Box.createRigidArea(new Dimension(0,10)));
        this.add(this.dailyCost);
        this.add(Box.createRigidArea(new Dimension(0,10)));
    }


    }
