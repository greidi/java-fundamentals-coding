package Perseritje;

import java.util.Scanner;

public class Dallori {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Jep vleren e A ");
        int a=scanner.nextInt();
        System.out.println("Jep vleren e B ");
        int b=scanner.nextInt();
        System.out.println("Jep vleren e C ");
        int c=scanner.nextInt();
        float d= b*b - 4*a*c;
        System.out.println("Dallori eshte " +d);

        if (d==0){
            double x1=(-b-Math.sqrt(d))/2*a;
            System.out.println("x1 eshte i = me x2 " +x1);

        }
        else if (d<0){
            System.out.println("Negative ");}
            else{
            double x1=(-b-Math.sqrt(d))/2*a;
            double x2= (-b+Math.sqrt(d))/2*a;
            System.out.println("Dallori ka x1 dhe x2 ");
            System.out.println("x1 eshte: " +x1);
            System.out.println("x2 eshte: " +x2);}

    }
}
