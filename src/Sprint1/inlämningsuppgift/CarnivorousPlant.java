package Sprint1.inlämningsuppgift;

import javax.swing.*;

public class CarnivorousPlant extends Greenest{

    public CarnivorousPlant(String name, double lengthOfPlant){
        super(name, lengthOfPlant);
    }

    /**
     * Polymorfism (Method overriding). Gör om metoderna för att passa klassen "CarnivorousPlant"
     */
    @Override
    public double calculateFluidAmount() {
        double standardFluid = 0.1;
        return standardFluid + (0.2 * getLengthOfPlant());
    }

    @Override
    public void printAmountOfFluid() {
        double amountOfWater = calculateFluidAmount();
        JOptionPane.showMessageDialog(null, this.getName() + " behöver " + amountOfWater + "L " + EBestEnums.FLUIDTYPE_CARNIVOROUS.getMessage());
    }
}