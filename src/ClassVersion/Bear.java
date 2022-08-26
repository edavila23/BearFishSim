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

    /*
    public void eat(int index) {
        if(river.getAnimalAt(index-1).getSymbol().equals("F")) {
            Bear b = new Bear();
            river.clearLoc(index - 1);
            river.clearLoc(index);
            river.addAnimal(b, index - 1);
        }
        else if(river.getAnimalAt(index+1).getSymbol().equals("F")) {
            Bear b = new Bear();
            river.clearLoc(index + 1);
            river.clearLoc(index);
            river.addAnimal(b, index + 1);
        }
    }
     */
}
