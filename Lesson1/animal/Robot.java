package Lesson1.animal;

import Lesson1.Participant;
import Lesson1.enums.Color;

/**
 * Робот не является животным, но может учавствовать в соревнованиях
 * так как реализует интерфейс {@link Participant}
 */
public class Robot implements Participant {

    private boolean isOnDistance;
    private int runDistance;
    private int jumpHeight;
    private int swimDistance;

    private String name;
    private Color color;
    private int age;

    public Robot(String name, Color color, int age, int runDistance, int jumpHeight, int swimDistance) {
        this.isOnDistance = true;
        this.name = name;
        this.color = color;
        this.age = age;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
    }
//    public Robot(String name, Color color) {
//        this(name, color, 0);
//
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void voice() {
        System.out.println("Жужжит сервоприводами");
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
            System.out.println(String.format("Робот %s пробежал кросс длиннойне смог пробежать %d метров", getName(), distance));
            return;
        }
        System.out.println(String.format("Робот %s пробежал кросс длинной %d метров", getName(), distance));


    }

    @Override
    public void jump(int height) {
        if (!isOnDistance) {
            return;
        }
        if (height > jumpHeight) {
            isOnDistance = false;
            System.out.println(String.format("Робот %s не прыгнул на %d метров", getName(), height));
            return;
        }
        System.out.println(String.format("Робот %s прыгнул на высоту %d метров", getName(), height));


    }

    @Override
    public void swim(int distance) {
        if (!isOnDistance) {
            return;
        }
        if (distance > swimDistance) {
            isOnDistance = false;
            System.out.println(String.format("Робот %s не проплыл %d метров", getName(), distance));
            return;
        }
        System.out.println(String.format("Робот %s проплыл %d метров", getName(), distance));


    }
}
