package Sprint1.inlämningsuppgift;

abstract class Greenest implements IBestInterface {

    // inkapsling
    private String name;
    private double lengthOfPlant;

    public Greenest(String name, double lengthOfPlant) {
        this.name = name;
        this.lengthOfPlant = lengthOfPlant;
    }

    public String getName() {
        return name;
    }

    public double getLengthOfPlant() {
        return lengthOfPlant;
    }
}