package isp.lab2.Exercise6WordGuess;

import java.util.Random;
import java.util.Scanner;


public class Exercise6WordGuess {

    /**
     * This method will return the number of occurrences of a character in a word
     *
     * @param c
     * @param word
     * @return
     */
    public static int countOccurence(char c, char[] word) {

        int k = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i] == c) {
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        String[] dictionar = {"mar", "banana", "cires", "curmala", "mure", "smochin", "strugure", "pepene galben", "kiwi", "lamaie"};
        Random rand = new Random();
        int index = rand.nextInt(dictionar.length);
        String wordToGuess = dictionar[index];
        char[] guessedWord = new char[wordToGuess.length()];
        Scanner scanner = new Scanner(System.in);
        int numTries = 0;
        for (int i = 0; i < guessedWord.length; i++) {
            if (wordToGuess.charAt(i) != ' ')
                guessedWord[i] = '_';
            else
                guessedWord[i] = ' ';
        }
        while (true) {
            System.out.println("Cuvantul curent : " + new String(guessedWord));
            System.out.println("Introduceti litera: ");
            char c = scanner.next().charAt(0);
            int numOccurences = countOccurence(c, wordToGuess.toCharArray());
            if (numOccurences > 0) {
                System.out.println("Litera " + c + " apare de " + numOccurences + " ori in cuvant!");
                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (wordToGuess.charAt(i) == c) {
                        guessedWord[i] = c;
                    }
                }
            } else {
                System.out.println("Scuze, litera " + c + " nu apare in cuvant!");
            }
            numTries++;

            if (new String(guessedWord).equals(wordToGuess)) {
                System.out.println("Felicitari, ai ghicit cuvantul din " + numTries + " incercari!");
                System.out.println("Cuvantul a fost: " + wordToGuess);
                break;
            }
        }
        scanner.close();
    }
}


