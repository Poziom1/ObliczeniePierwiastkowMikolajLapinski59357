import java.util.Scanner;

public class Obliczanie_pierwiastka_Mikolaj_Lapinski {
    public static void main(String[] args) {
        Scanner Uzytkownik = new Scanner(System.in);
        float a;
        float b;
        float c;
        float x1;
        float x2;
        float delta;
        byte sparwdz = 0;
        System.out.println("Podaj a: ");
        a = Uzytkownik.nextFloat();
        System.out.println("Podaj b: ");
        b = Uzytkownik.nextFloat();
        System.out.println("Podaj c: ");
        c = Uzytkownik.nextFloat();
        if (a == 0) {
            System.out.println("Error: Wykryto zero.");
            return;
        }
        delta = (b*b)-(4*a*c);
        if (delta == 0) {
            sparwdz = 1;
        }
        switch (sparwdz) {
            case 0:{
              x1 = (float) (Math.sqrt(delta)-b)/(2*a);
              x2 = (float)(-(Math.sqrt(delta))-b)/(2*a);
              System.out.println("x1 = "+x1+" x2 = "+x2);
            }
            case 1:{
                x1= (-b)/(2*a);
                System.out.println("xp = "+x1);
            }
        }
    }
}


