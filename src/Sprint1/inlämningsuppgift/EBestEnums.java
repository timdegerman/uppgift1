package Sprint1.inlämningsuppgift;

public enum EBestEnums {
    QUESTION("Vilken planta ska få vätska?"),

    FLUIDTYPE_PALM("kranvatten"),
    FLUIDTYPE_CACTUS("mineralvatten"),
    FLUIDTYPE_CARNIVOROUS("proteindryck");

    private String message;

    EBestEnums(String enumMessage) {
        this.message = enumMessage;
    }

    public String getMessage() {
        return message;
    }

}
