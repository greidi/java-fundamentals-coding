
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.emri = "Greidi";


        Human human2= new Human("Kevin");
Human human3 = new Human("j6e", "Eri" , 23);



    System.out.println("Emri: " +human.emri);
        System.out.println("Emri: " +human2.emri);
        System.out.println("id: " +human3.id);
        System.out.println("Emri: " +human3.emri);
        System.out.println("Mosha:" +human3.mosha);
    }
    }
