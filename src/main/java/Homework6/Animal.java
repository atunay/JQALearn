package Homework6;

public abstract class Animal implements IAnimal {
    abstract public void play ();
}

class Bird extends Animal {
    @Override
    public void play() {
    System.out.println("Birds plays happy.");
    }

    @Override
    public void makeSomeNoise() {
    System.out.println("Birds can be so noisy sometime!");
    }
    void synk () {
        System.out.println("Tweet, tweet");
    }
    void fly () {
        System.out.println("Eagle fly free.");
    }
}

class Cat extends Animal {

    @Override
    public void play() {
    System.out.println("Cats plays like crazy dogs:).");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Cats scream like tigers");

    }
    void climp () {
        System.out.println("Cats climps hard.");
    }
}
class Dog extends Animal{

    @Override
    public void play() {
    System.out.println("Dogs are stupid and they doesn't plays at all!");
    }

    @Override
    public void makeSomeNoise() {
    System.out.println("Dogs screams like wolfs. Joke.");
    }
    public void bringStick () {
        System.out.println("Bring the fucking stick.");
    }
}