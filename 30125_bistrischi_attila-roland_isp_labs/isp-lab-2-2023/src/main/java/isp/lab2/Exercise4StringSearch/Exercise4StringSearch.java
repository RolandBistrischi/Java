package isp.lab2.Exercise4StringSearch;

import java.util.Scanner;

public class Exercise4StringSearch {
    /**
     * This method should return an array of strings that contain the substring.
     *
     * @param input
     * @param substring what to search for
     * @return
     */
    public static String[] searchSubstrings(String input, String substring) {
        String[] inputs = input.split(",");
        String[] rezultat = new String[inputs.length];
        int k = 0;
        for (String s : inputs) {
            if (s.contains(substring)) {
                rezultat[k] = s;
                k++;
            }
        }
        String[] rezultatFinal = new String[k];
        for (int i = 0; i < k; i++) {
            rezultatFinal[i] = rezultat[i];
        }
        return rezultatFinal;
    }

    public static String readFromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String input = "apples,computer,bread,tea,car";
        String substring = "te";
        String[] result = searchSubstrings(input, substring);
        for (String string : result) {
            System.out.println(string);
        }
    }
}
