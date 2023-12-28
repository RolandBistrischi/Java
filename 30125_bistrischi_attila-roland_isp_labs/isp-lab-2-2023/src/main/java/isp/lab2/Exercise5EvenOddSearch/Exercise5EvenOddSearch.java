package isp.lab2.Exercise5EvenOddSearch;

import java.util.Scanner;

public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input) {
        String[] inputs = input.split(",");
        int[] rezultat = new int[4];
        rezultat[0] = rezultat[1] = -1;
        rezultat[2] = rezultat[3] = -1;

        for (int i = 0; i < inputs.length; i++) {
            int value = Integer.parseInt(inputs[i]);
            if (value % 2 == 0) {
                if (rezultat[1] == -1) {
                    rezultat[0] = value;
                    rezultat[1] = i;
                } else if (rezultat[0] < value) {
                    rezultat[0] = value;
                    rezultat[1] = i;
                }

            } else {
                if (rezultat[3] == -1) {
                    rezultat[2] = value;
                    rezultat[3] = i;
                } else if (rezultat[2] > value) {
                    rezultat[2] = value;
                    rezultat[3] = i;
                }
            }
        }

        if (rezultat[1] == -1) {
            System.out.println("There are no even numbers in the list.");
        } else if (rezultat[3] == -1)
            System.out.println("There are no odd numbers in the list.");

        return rezultat;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of integers separated by commas: ");
        String input = scanner.nextLine();
        //String input = "1,2,3,4,5,6,7,8,9,10";
        int[] result = findEvenOdd(input);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
