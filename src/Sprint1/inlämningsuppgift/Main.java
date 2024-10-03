package Sprint1.inlämningsuppgift;

import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.List;

public class Main {

    boolean appRunning = true;
    public Main() {

        // Skapar objekt av referenstypen "Greenest" för att sedan kunna lägga in dem i en lista
        // Polymorfism av "greenest"

        Greenest laura = new Palmer("Laura", 5);
        Greenest olof = new Palmer("Olof", 1);
        Greenest igge = new Kaktusar("Igge", 0.2);
        Greenest meatloaf = new CarnivorousPlant("Meatloaf", 0.7);

        List<Greenest> plants = Arrays.asList(laura, olof, igge, meatloaf);

        while (appRunning) {
            String input = JOptionPane.showInputDialog(null, "Vilken planta ska få vätska?");
            boolean foundPlant = false;
            if (input != null) {
                for (int i = 0; i < plants.size(); i++) {
                    if (plants.get(i).getName().equalsIgnoreCase(input)) {
                        plants.get(i).printAmountOfFluid();
                        foundPlant = true;
                        break;
                    }
                }
                if (!foundPlant) {
                    JOptionPane.showMessageDialog(null, "Kunde inte hitta: " + input + "." + '\n'
                            + "Kontrollera stavning.");
                }
            } else {
                appRunning = false;
            }
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
    }
}