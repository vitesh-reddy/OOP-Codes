import java.util.*;

abstract class AnimalBehavior {
    abstract void move();

    abstract void makeSound();
}

class Mammal extends AnimalBehavior {

    Mammal() {
        this.s1 = "Sound of a Mammal";
        this.s2 = "Move of a Mammal";
    }

    private String getSound() {
        return s1;
    }

    private String s1;

    void makeSound() {
        System.out.println(getSound());
    }

    private String s2;
    String abc;

    void move() {
        System.out.println(getMove());
    }

    private String getMove() {
        return s2;
    }
}

class Bird extends AnimalBehavior {

    Bird() {
        this.s1 = "Sound of a Bird";
        this.s2 = "Move of a Bird";
    }

    private String getSound() {
        return s1;
    }

    private String s1;

    void makeSound() {
        System.out.println(getSound());
    }

    private String s2;
    String abc;

    void move() {
        System.out.println(getMove());
    }

    private String getMove() {
        return s2;
    }

}

class Lion extends Mammal {

    private String s1;

    Lion() {
        this.s1 = "Loud Roar";
        this.s2 = "Runs at very High speed on Land";
    }

    private String s2;

    private String getSound() {
        return this.s1;
    }

    void makeSound() {
        System.out.println(this.getSound());
    }

    private String getMove() {
        return this.s2;
    }

    void move() {
        System.out.println(this.getMove());
    }
}

class Eagle extends Bird {
    private String s1;

    Eagle() {
        this.s2 = "Screech and fly at very high heights";
        this.s1 = "Soars with high pitch";
    }

    void makeSound() {
        System.out.println(getSound());
    }

    private String s2;

    private String getSound() {
        return this.s1;
    }

    void move() {
        System.out.println(getMove());
    }

    private String getMove() {
        return s2;
    }
}

class Zoo {
    private int animal_count;
    private List<AnimalBehavior> animals;

    public Zoo() {
        this.animal_count = 0;
        animals = new ArrayList<>();
    }

    public void addAnimal(AnimalBehavior animal) {
        animal_count += 1;
        animals.add(animal);
    }

    public void makeAllSounds() {
        int i = 0;
        for (AnimalBehavior animal : animals) {
            animal.makeSound();
            if (i++ >= animal_count)
                break;
        }
    }

    public void moveAll() {
        int i = 0;
        for (AnimalBehavior animal : animals) {
            animal.move();
            if (i++ >= animal_count)
                break;
        }
    }
}

public class S20230010123_Assignment8P1 {
    public static void main(String[] args) {
        System.out.println();
        int i = 4, j = 5;
        Zoo zoo = new Zoo();
        int temp = i;
        Lion lion = new Lion();
        i = j;
        Eagle eagle = new Eagle();
        j = temp;
        zoo.addAnimal(lion);
        temp = j;
        zoo.addAnimal(eagle);
        j = i;
        zoo.makeAllSounds();
        i = temp;
        zoo.moveAll();
        temp = i + j;
        System.out.println();
    }
}
