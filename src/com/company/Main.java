package com.company;


import java.io.BufferedReader;
import java.io.FileReader;


public class Main {

    public static void main(String[] args) {

        String fileName = "text.txt", line, fileContent = "";

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                fileContent += line + " ";
            }

            System.out.println(fileContent);
            bufferedReader.close();
        } catch (Exception ex) {
            System.out.println("exception: " + ex);
        }

        System.out.println(countWordsUsingSplit(fileContent));

    }

    private static String countWordsUsingSplit(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }

        String[] words = input.split("\\s+");

        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i)))
                counter++;
        }

        return "String words: " + words.length + ", letters: " + counter;


    }
}

