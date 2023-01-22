package Homework6;

public class AnimalDemo {
    public static void main (String[] args) {
        Animal bird = new Bird();
        bird.makeSomeNoise();
        bird.play();

        Bird bird2 = new Bird();
        bird2.synk();
        bird2.fly();

        Animal cat = new Cat();
        cat.makeSomeNoise();
        cat.play();

        Cat cat2 = new Cat();
        cat2.climp();

        Dog dog = new Dog();
        dog.makeSomeNoise();
        dog.play();
        dog.bringStick();
        }
    }

