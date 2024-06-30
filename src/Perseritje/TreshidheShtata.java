package Perseritje;

import java.util.Scanner;

public class TreshidheShtata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos numrin");
        int numri = scanner.nextInt();
        for (int i = 0; i < numri; i++) ;
        if (numri % 7 == 0 && numri % 3 == 0) {
            System.out.println("Fizz Buzz");
        } else if (numri % 7 == 0) {
            System.out.println("Buzz");
        } else if (numri % 3 == 0) {
            System.out.println("Fizz ");
        }
    }
}