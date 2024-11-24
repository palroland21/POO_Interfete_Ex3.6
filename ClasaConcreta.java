public class ClasaConcreta extends ClasaMea implements Interfata4{

    public void metoda1(){
        System.out.println("Metoda1");
    }

    public void metoda2(){
        System.out.println("Metoda2");
    }

    public void metoda3(){
        System.out.println("Metoda3");
    }

    public void metoda4(){
        System.out.println("Metoda4");
    }

    public void metoda5(){
        System.out.println("Metoda5");
    }

    public void metoda6(){
        System.out.println("Metoda6");
    }

    public void metoda7(){
        System.out.println("Metoda7");
    }

    // Cele 4 metoda care primesc interfete ca argument
    public void metodaCuIneterfata1(Interfata1 i1){
        i1.metoda1();
        i1.metoda2();
    }

    public void metodaCuIneterfata2(Interfata2 i2){
        i2.metoda3();
        i2.metoda4();
    }

    public void metodaCuIneterfata3(Interfata3 i3){
        i3.metoda5();
        i3.metoda6();
    }

    public void metodaCuIneterfata4(Interfata4 i4){
        i4.metoda1();
        i4.metoda2();
        i4.metoda3();
        i4.metoda4();
        i4.metoda5();
        i4.metoda6();
        i4.metoda7();
    }

}
