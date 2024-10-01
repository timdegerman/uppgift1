package Sprint1.inlämningsuppgift;

import javax.swing.*;

public class Palmer extends Greenest{


    public Palmer(String name, double lengthOfPlant) {
        super(name, lengthOfPlant);
    }

    /**
     * Polymorfism (Method overriding). Gör om metoderna för att passa klassen "Palmer"
     */
    @Override
    public double calculateFluidAmount() {
        return 0.5 * getLengthOfPlant();
    }

    @Override
    public void printAmountOfFluid() {
        double amountOfWater = calculateFluidAmount();
        JOptionPane.showMessageDialog(null, this.getName() + " behöver " + amountOfWater + "L " + EBestEnums.FLUIDTYPE_PALM.getMessage());
    }
}
