package Lesson1;

import Lesson1.animal.Cat;


import Lesson1.animal.Dog;
import Lesson1.animal.Human;
import Lesson1.animal.Robot;
import Lesson1.course.Course;
import Lesson1.course.Cross;
import Lesson1.course.Wall;
import Lesson1.course.Water;
import Lesson1.enums.Color;


public class Application {
    public static void main(String[] args) {
        Team team = new Team("Четыре калеки",

                new Cat("Барсик", Color.BLACK, 1, 100, 15),
                new Dog("Шарик", Color.BLACK,9,60, 100, 5),
                new Human("Вася",Color.RED,12,5, 100, 5),
                new Robot("Вася",Color.BLACK,12,60, 100, 5)
        );



        Course course = new Course(
                new Cross(50),
                new Wall(10),
                new Water(5)
        );

        // Пока так и не разобрался, почему этот метод мне абракадабру вместо данных выводит;
        team.getInfo();

        course.doIt(team);

    }
}
