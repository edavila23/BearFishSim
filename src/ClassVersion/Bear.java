package ClassVersion;

public class Bear extends Animal {
    private String symbol;

    public Bear() {
        super.setSymbol("B");
    }

    public Bear(String symbol) {
        this.symbol = symbol;
    }

    public static void setRiver(River river) {
        Animal.river = river;
    }
}
