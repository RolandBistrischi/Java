package isp.lab2.Exercise2PrimeProduct;

import java.util.Scanner;

public class Exercise2PrimeProduct {

    /**
     * This method should return the product of the first n prime numbers
     *
     * @param n
     * @param m
     * @return
     */
    public static long getPrimeProduct(int n, int m) {
        if (n > m || n < 0) {
            System.out.println("ERROR M should be higher than N OR n negative");
            return -1;
        } else {
            long produs = 1;
            for (int i = n; i <= m; i++) {
                boolean ok = true;
                if (i == 1)
                    ok = false;
                else if (i == 2)
                    ok = true;
                else if (i % 2 == 0)
                    ok = false;
                else {
                    for (int j = 3; j * j <= i && ok; j = j + 2)
                        if (i % j == 0)
                            ok = false;
                }
                if (ok)
                    produs = produs * i;
            }
            return produs;
        }
    }


    /**
     * This method should read from the console a number
     *
     * @return the number read from the console
     */
    public static int readfromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("The product of the first 10 prime numbers is: " + getPrimeProduct(1, 10));
        System.out.println("The product of prime numbers between m and n: " + getPrimeProduct(readfromConsoleInt(), readfromConsoleInt()));
    }

}
