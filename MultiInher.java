// Interface for animals that can move
interface Movable {
    void move();
}

// Interface for animals that can make a sound
interface Soundable {
    void makeSound();
}

// Class representing a dog
class Dog implements Movable, Soundable {
    public void move() {
        System.out.println("Dog is running");
    }

    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Class representing a bird
class Bird implements Movable, Soundable {
    public void move() {
        System.out.println("Bird is flying");
    }

    public void makeSound() {
        System.out.println("Bird chirps");
    }
}

public class MultiInher {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();

        // Dog behavior
        System.out.println("Dog:");
        dog.move();
        dog.makeSound();

        // Bird behavior
        System.out.println("\nBird:");
        bird.move();
        bird.makeSound();
    }
}
