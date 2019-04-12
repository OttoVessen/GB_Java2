package Lesson3;

import java.util.*;

public class TelephoneDirectory {
    //Создаю Map в котором key является коллекцией стрингов(как вы показывали на занятии)
    Map<String, List<String>> direct = new HashMap<>();

    //Метод для добавления
    public void add(String key, String val) {

        List<String> addList = new LinkedList<>();
        addList = get(key);
        addList.add(val);
        direct.put(key, addList);
    }

    //Метод для извлечения
    public List<String> get(String key) {
        List<String> getList = new LinkedList<>();

        if (direct.containsKey(key)) {
            getList = direct.get(key);
        }

        return getList;
    }



}
