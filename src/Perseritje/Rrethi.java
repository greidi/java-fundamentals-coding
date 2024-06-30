package Perseritje;

import java.util.Scanner;

public class Rrethi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jep diamterin");
        float diametri = scanner.nextFloat();
        float rrezja = diametri / 2;
        float periemtri = (float) (2 * Math.PI*rrezja);
        double perimetri2 = (2 * Math.PI * rrezja);
        System.out.println("Perimetri float eshte " + periemtri);
        System.out.println("Perimetri double eshte " + perimetri2);
    }
}