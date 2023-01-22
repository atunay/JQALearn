package Homework6;

public class AnimalDemo {
    public static void main (String[] args) {
        Animal bird = new Bird();
        bird.makeSomeNoise();
        bird.play();

        Bird bird2 = new Bird();
        bird2.synk();
        bird2.fly();
        bird2.makeSomeNoise();
        bird2.play();

        Animal cat = new Cat();
        cat.makeSomeNoise();
        cat.play();

        Cat cat2 = new Cat();
        cat2.climp();
        cat2.makeSomeNoise();
        cat2.play();

        Animal dog = new Dog();
        dog.makeSomeNoise();
        dog.play();

        Dog dog2 = new Dog();
        dog2.makeSomeNoise();
        dog2.play();
        dog2.bringStick();
        }
    }

