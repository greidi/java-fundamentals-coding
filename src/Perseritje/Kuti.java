package Perseritje;

public class Kuti {
    int gjatesi;
    int gjeresi;
    int lartesi;

    public Kuti(int gjatesi, int gjeresi, int lartesi) {
        this.gjatesi = gjatesi;
        this.gjeresi = gjeresi;
        this.lartesi = lartesi;
    }
    public double vellimi(){
        int vellimi = gjatesi*gjeresi*lartesi;
        return vellimi;
    }
}






