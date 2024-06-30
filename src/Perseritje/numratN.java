package Perseritje;

import java.util.Scanner;

public class numratN {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Vendos numrin");
            int numri= scanner.nextInt();
            double sum=0;
            for (int i= 1; i<numri; i++){
                System.out.println("Shuma: " + sum + " iteracioni: " +i);
                sum=sum+ (double) 1 /i;}
            System.out.println(sum);
        }
    }