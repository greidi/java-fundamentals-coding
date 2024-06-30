package Perseritje;

import java.util.Scanner;

public class PeshaBMI {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Jep peshen ");
        float pesha= scanner.nextFloat();
        System.out.println("Jep gjatesine ");
        int gjatesia= (int) scanner.nextFloat();
        double gjatesiad = ((double) gjatesia )/100;
        gjatesiad = Math.pow(gjatesiad,2);
        float bmi= (float) (pesha / gjatesiad);

        System.out.println("Bmi eshte " +bmi);
        if (bmi>18.5 && bmi< 24.9){
        System.out.println("BMI is optimal");}
        else {
            System.out.println("BMI is not optimal");}



    }
}
