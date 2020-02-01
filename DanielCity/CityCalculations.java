import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import java.awt.Color;


public class CityCalculations extends JPanel
{
    private long consumption;
    private double emissions;
    private long dailyCost;
    private JLabel consumeText;
    private JLabel emissionText;
    private JLabel dailyCostText;

    public CityCalculations()
    {
        this.setPreferredSize(new Dimension(200,200));
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        this.setBackground(Color.white);

        this.consumption = 0;
        this.emissions = 0;
        this.dailyCost = 0;

        this.consumeText = new JLabel("Net Consumption: 0");
        this.emissionText = new JLabel("Emissions: 0");
        this.dailyCostText = new JLabel("Daily Cost: 0");

        consumeText.setAlignmentX(CENTER_ALIGNMENT);
        emissionText.setAlignmentX(CENTER_ALIGNMENT);
        dailyCostText.setAlignmentX(CENTER_ALIGNMENT);

        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        this.add(consumeText);
        this.add(Box.createRigidArea(new Dimension(0,10)));
        this.add(emissionText);
        this.add(Box.createRigidArea(new Dimension(0,10)));
        this.add(dailyCostText);
        this.add(Box.createRigidArea(new Dimension(0,10)));
    }

    public void update(long addConsumption, double addEmissions, long addDailyCost)
    {
        consumeText.setText("Net Consumption: " + (this.consumption += addConsumption));
        emissionText.setText("Emissions: " + (this.emissions += addEmissions));
        dailyCostText.setText("Daily Cost: " + (this.dailyCost += addDailyCost));

    }
}
