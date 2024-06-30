package Perseritje;

public class Main1{
    public static void main(String[] args) {
        Kuti kutia=new Kuti(2,4,5);
        Kuti kutia2=new Kuti(4,6,3);
        int vellimi= kutia.gjatesi* kutia.gjeresi* kutia.lartesi;
        System.out.println("Vellimi eshte: " + vellimi);
        int vellimi2= kutia2.gjatesi* kutia2.gjeresi* kutia2.lartesi;
        System.out.println("Vellimi eshte: " + vellimi2);

    }
}


