package Lesson1.animal;

import Lesson1.Participant;
import Lesson1.enums.Color;

public class Dog extends Animal implements Participant {

    private boolean isOnDistance;
    private int runDistance;
    private int jumpHeight;
    private int swimDistance;

    public Dog (String name, Color color, int age, int runDistance, int jumpHeight,int swimDistance) {

        super(name, color, age);
        this.isOnDistance = true;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;


    }

    public Dog (String name, Color color) {
        super(name, color, 0);
    }

    @Override
    public void voice() {
        System.out.println("Гав");
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
            System.out.println(String.format("Собака %s не смогла пробежать %d метров", getName(), distance));
            return;
        }
        System.out.println(String.format("Собака %s пробежала кросс длинной %d метров", getName(), distance));


    }

    @Override
    public void jump(int height) {
        if (!isOnDistance) {
            return;
        }
        if (height > jumpHeight) {
            isOnDistance = false;
            System.out.println(String.format("Собака %s не прыгнула на %d метров", getName(), height));
            return;
        }
        System.out.println(String.format("Собака %s прыгнула на высоту %d метров", getName(), height));
        

    }

    @Override
    public void swim(int distance) {
        if (!isOnDistance) {
            return;
        }
        if (distance > swimDistance) {
            isOnDistance = false;
            System.out.println(String.format("Собака %s  не проплыла  %d метров", getName(), distance));
            return;
        }
        System.out.println(String.format("Собака %s проплыла  %d метров", getName(), distance));


    }
}
