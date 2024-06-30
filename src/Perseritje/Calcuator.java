package Perseritje;

import java.util.Scanner;

public class Calcuator {
    public static void main(String[] args) {
        double vlera=llogarit();
        System.out.print(vlera);


    }
    public static double llogarit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vendos numrin e pare");
        float numri1 = scanner.nextFloat();
        System.out.print("Vendos operatorin");
        char operatori = scanner.next().charAt(0);
        System.out.print("Vendos numrin e dyte");
        float numri2 = scanner.nextFloat();

        switch (operatori) {
            case '+':
                return numri1 + numri2;
            case '-':
                return numri1 - numri2;

            case '*':
                return numri1 * numri2;
            case '/':
                if (numri2 == 0) {
                    System.out.print("Pjesetimi me 0 nuk ka kuptim");
                    return Integer.MIN_VALUE;
                } else {
                    return numri1 / numri2;
                }
            default:
                System.out.println("Invalid operator");
        }
        return Integer.MIN_VALUE;

    }
}