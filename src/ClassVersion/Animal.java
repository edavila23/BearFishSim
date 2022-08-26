package ClassVersion;

public class Animal {
    private String symbol;
    static River river;

    public Animal() {
        symbol = "A";
    }

    public Animal(String symbol, int index) {
        this.symbol = symbol;
    }

    public static void setRiver(River river) {
        Animal.river = river;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void act(int index) {
        if(river == null)
            throw new IllegalStateException("Cannot act = No river set for animals");

        int choice = (int)(1 + Math.random() * 100);
        if(choice <= 20) { //move left
            //Make sure I am not at the left end
            if(index == 0)
                return; //exit, cannot move

            //get the Animal next to me
            Animal nextToMe = river.getAnimalAt(index-1);
            //if the space is empty, move to it
            if(nextToMe == null) {
                river.clearLoc(index);
                river.addAnimal(this, index-1);
            }
            else if(nextToMe == this) {
                mult(index);
            }
        }
        else if(choice <= 40) { //move right
            //Make sure I am not at the left end
            if(index == 99)
                return; //exit, cannot move

            //get the Animal next to me
            Animal nextToMe = river.getAnimalAt(index+1);
            //if the space is empty, move to it
            if(nextToMe == null) {
                river.clearLoc(index);
                river.addAnimal(this, index+1);
            }
            else if(nextToMe == this) {
                mult(index);
            }
        }
    }

    public void mult(int index) {
        Animal a = new Animal();
        for(int i=0; i < 100; i++) {
            if(river.getAnimalAt(i) == null) {
                River.addAnimal(a, i);
                return;
            }
        }
    }
}
