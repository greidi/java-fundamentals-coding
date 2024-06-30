package Perseritje;

import java.util.Scanner;

public class MainFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vendos nje numer pozitiv");
        int index = scanner.nextInt();
        if (index >= 0) {
            System.out.println(Fibonacci.fibo(index) + "");
        } else {
            System.out.println("Numri qe vendoset nuk eshte i sakte");
        }
    }}
