package org.example.lab3.util;

import java.util.*;

public class AlphabetMapping {

    List<String> Alphabet = Arrays.asList("А", "Б", "В", "Г", "Ґ", "Д", "Е", "Є", "Ж", "З", "И", "І", "Ї", "Й", "К",
            "Л", "М", "Н",
            "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ь", "Ю", "Я");

    public int getIndex(String letter) {
        return Alphabet.indexOf(letter);
    }

    public String getLetter(int index) {
        return Alphabet.get(index);
    }
}
