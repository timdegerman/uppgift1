package Sprint1.inlämningsuppgift;

import javax.swing.*;

public class Kaktusar extends Greenest{

    public Kaktusar(String name, double lengthOfPlant){
        super(name, lengthOfPlant);
    }

    /**
     * Polymorfism. Gör om metoderna för att passa klassen Kaktusar
     */
    @Override
    public double calculateFluidAmount() {
        return 0.02;
    }

    @Override
    public void printAmountOfFluid() {
        double amountOfWater = calculateFluidAmount();
        JOptionPane.showMessageDialog(null, this.getName() + " behöver " + amountOfWater + "L " + EBestEnums.FLUIDTYPE_CACTUS.getMessage());
    }
}