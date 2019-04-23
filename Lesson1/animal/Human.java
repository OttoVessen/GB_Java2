package Lesson1.animal;

import Lesson1.Participant;
import Lesson1.enums.Color;

public class Human extends Animal implements Participant {
    private boolean isOnDistance;
    private int runDistance;
    private int jumpHeight;
    private int swimDistance;


    public Human(String name, Color color, int age, int runDistance, int jumpHeight, int swimDistance) {
        super(name, color, age);
        this.isOnDistance = true;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
    }

    public Human(String name, Color color) {
        super(name, color, 0);
    }

    @Override
    public void voice() {
        System.out.println("Рассказывает анекдоты");
    }

    @Override
    public boolean isOnDistance() {
        return isOnDistance;
    }

    @Override
    public void run(int distance) {
        if (!isOnDistance) {
            return;
        }
        if (distance > runDistance) {
            isOnDistance = false;
            System.out.println(String.format("Человек %s не пробежал %d метров", getName(), distance));
            return;
        }
        System.out.println(String.format("Человек %s пробежал кросс длинной %d метров", getName(), distance));System.out.println();

    }

    @Override
    public void jump(int height) {
        if (!isOnDistance) {
            return;
        }
        if (height > jumpHeight) {
            isOnDistance = false;
            System.out.println(String.format("Человек %s не смог прыгнуть на %d метров", getName(), height));
            return;
        }
        System.out.println(String.format("Человек %s прыгнул на высоту %d метров", getName(), height));


    }

    @Override
    public void swim(int distance) {
        if (!isOnDistance) {
            return;
        }
        if (distance > swimDistance) {
            isOnDistance = false;
            System.out.println(String.format("Человек %s не смог проплыть %d метров", getName(), distance));
            return;
        }
        System.out.println(String.format("Человек %s проплыл %d метров", getName(), distance));

    }
}
