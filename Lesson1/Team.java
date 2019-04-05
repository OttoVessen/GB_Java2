package Lesson1;

import java.util.Arrays;

public class Team {
    /**
     * Класс - комманда участников соревнований
     */
    String teamName;

    private Participant[] participants;

    // здесь используется конструктор с переменным числом параметров
    public Team(String name, Participant... participants) {
        // внутри метода переменное число параметров интерпретируется как массив

        this.teamName = name;

        this.participants = participants;


    }

    public Participant[] getParticipants() {
        return participants;
    }

    public void getInfo() {
        System.out.println("Сейчас выступает команда " + teamName);
        for (int i = 0; i < participants.length; i++) {
            System.out.println(participants);
        }
    }


}
