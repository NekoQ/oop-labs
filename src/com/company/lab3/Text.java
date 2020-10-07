package com.company.lab3;

import java.util.*;

public class Text {
    String text;

    public Text(String text) {
        this.text = text;
    }

    public void printNrSentences() {
        char prev = ' ';
        int nr = 1;
        for (char c : text.toCharArray()) {
            if ((prev == '.' || prev == '?' || prev == '!') && c == ' ')
                nr++;
            prev = c;
        }
        System.out.println("Nr of sentences : " + nr);
    }

    public void printNrWords() {
        int nr = 1;
        for (char c : text.toCharArray()) {
            if (c == ' ' || c == '\n')
                nr++;
        }
        System.out.println("Nr of words : " + nr);
    }

    public void printLettersInfo() {
        String vowels = "aoeuiAOEUI";
        int letter = 0, vowel = 0, consonant = 0;
        for (char c : text.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                letter++;
                if (vowels.indexOf(c) > -1)
                    vowel++;
                else
                    consonant++;
            }
        }
        System.out.println("Letters: " + letter + "\nVowels: " + vowel + "\nConsonants: " + consonant);
    }

    public void printWordsInfo() {
        Map<String, Integer> freq = new HashMap<>();

        String[] words = text.replaceAll("[(]|[)]|[.]|[,]|[;]|[:]|[\"]|[!]|[?]", "").split(" ");

        for (String word : words) {
            word = word.toLowerCase();
            int count = freq.containsKey(word) ? freq.get(word) : 0;
            freq.put(word, count + 1);
        }

        System.out.println("Top 5 words by frequency:");
        for (int i = 0; i < (Math.min(freq.size(), 5)); i++) {
             int max = -1;
             String maxString = "";
             for (Map.Entry<String, Integer> entry : freq.entrySet()) {
                 if (entry.getValue() > max) {
                     max = entry.getValue();
                     maxString = entry.getKey();
                 }
             }
            System.out.println(maxString + " - " + max);
             freq.put(maxString, -1);
        }

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        String[] uWords = new String[uniqueWords.size()];
        uniqueWords.toArray(uWords);
        Arrays.sort(uWords, Comparator.comparingInt(String::length).reversed());

        System.out.println("Top 5 words by length:");
        for (int i = 0; i < Math.min(uWords.length, 5); i++) {
            System.out.println(uWords[i].toLowerCase() + " - " + uWords[i].length());
        }
    }
}