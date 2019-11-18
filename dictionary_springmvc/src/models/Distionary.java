package models;

import java.util.HashMap;

public class Distionary {
    HashMap<String , String> listDictionary = new HashMap<>();

    {
        listDictionary.put("Hello","Xin chào");
        listDictionary.put("Goodbye","Tạm Biệt");
        listDictionary.put("Love you","Yêu mày");
        listDictionary.put("Hate you","Ghét chào");

    }
    public String translate(String English) {
        return listDictionary.get(English);
    }
}
