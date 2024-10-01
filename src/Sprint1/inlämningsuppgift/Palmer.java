package Sprint1.inlämningsuppgift;

import javax.swing.*;

public class Palmer extends Greenest{


    public Palmer(String name, double lengthOfPlant) {
        super(name, lengthOfPlant);
    }

    /**
     * Polymorfism (Method overriding). Overridear metoderna från superklassen "Greenest"
     */
    @Override
    public double waterPlant() {
        return 0.5 * getLengthOfPlant();
    }

    @Override
    public void printAmountOfFluid() {
        double amountOfWater = waterPlant();
        JOptionPane.showMessageDialog(null, this.getName() + " behöver " + amountOfWater + "L " + EBestEnums.FLUIDTYPE_PALM.getMessage());
    }
}
