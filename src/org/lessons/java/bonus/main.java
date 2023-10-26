package org.lessons.java.bonus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scanner.nextLine();
        Map<Character, Integer> wordMap = new HashMap<>();



        for (int i = 0; i < word.length(); i++) {
            int letterCounter = 1;
            if (wordMap.containsKey(word.charAt(i))){
                letterCounter ++;
            }
            wordMap.put(word.charAt(i), letterCounter);
        }

        System.out.println(wordMap);

    }


}
