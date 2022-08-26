package ClassVersion;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        River myRiver = new River();

        Animal.setRiver(myRiver);
        myRiver.addAnimal(new Bear(), 30);
        myRiver.addAnimal(new Bear(), 70);
        myRiver.addAnimal(new Bear(), 71);
        myRiver.addAnimal(new Fish(), 24);
        myRiver.addAnimal(new Fish(), 25);
        myRiver.addAnimal(new Fish(), 40);
        myRiver.addAnimal(new Fish(), 52);
        myRiver.addAnimal(new Fish(), 90);


        while(true) {
            myRiver.stepSim();
            System.out.println(myRiver);
            Thread.sleep(400);
        }

    }
}
