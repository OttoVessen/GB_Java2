package Lesson3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {

        //Создаём тестовый массив значений
        String[] wordArray = {"red", "green", "blue", "green", "black", "blue", "yellow", "yellow", "green", "green"};

        HashSet<String> hs = new HashSet<>();

        Map<String, Integer> map = new HashMap<>();

        for (String str : wordArray
        ) {

            hs.add(str);

            Integer v = 1;

            if (map.containsKey(str)) {

                v = map.get(str) + 1;

            }
            map.put(str, v);
        }
        //В телеграмме была куча трактовок задания)), но я понял так.

        //Сначала вывел какие слова встречаются в массиве.
        System.out.println(hs);

        //А здесь вывел сколько раз каждое слово встречается.
        System.out.println(map);

        //Если я неправильно понял задание то переделаю как надо.

        System.out.println();

        //Создаю новый экземпляр класса и использую метод add для заполнения Map данными
        TelephoneDirectory telephone = new TelephoneDirectory();
        telephone.add("Филатов", "23-15-45");
        telephone.add("Филатов", "27-17-78");
        telephone.add("Андреев", "29-99-88");

        //Ввожу несколько ключей для проверки метода get
        String key1 = "Филатов";
        String key2 = "Андреев";

        System.out.println(key1 + " " + telephone.get("Филатов"));
        System.out.println(key2 + " " + telephone.get("Андреев"));


    }
}
