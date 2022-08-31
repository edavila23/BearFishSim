package ClassVersion;

public class Fish extends Animal {
    private String symbol;

    public Fish() {
        super.setSymbol("F");
    }

    public Fish(String symbol) {
        this.symbol = symbol;
    }

    public static void setRiver(River river) {
        Animal.river = river;
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
            if(nextToMe == this) {
                mult();
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
            if(nextToMe == this) {
                mult();
            }    
        }
    }
    
    public void mult() {
        ArrayList<> eArray = emptyArray();
        if(eArray.size() < 1)
            return;
        boolean decide = false;
        while(decide = false) {
            int random = (int)(1 + Math.random() * 100);
            for(int i=0; i < eArray.size(); i++) {
                if(eArray.get(i) == random) {
                    river.addAnimal(new Fish(), eArray.get(i));
                    decide = true;
                }        
            }    
        }    
    }    
    
    public ArrayList<> emptyArray() {
        ArrayList<int> avail = new ArrayList<>();
        for(int i=0; i < 100; i++) {
            if(river.getAnimalAt(i) == null)
                avail.add(i);
        }
        return avail;
    }    
}
