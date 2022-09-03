import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int mat, fiz, kim, turk, tar, muz;
        System.out.println("Mat not:");
        mat=inp.nextInt();
        System.out.println("Fizik not:");
        fiz=inp.nextInt();
        System.out.println("Kimya not:");
        kim=inp.nextInt();
        System.out.println("Türkçe not:");
        turk=inp.nextInt();
        System.out.println("Tarih not:");
        tar=inp.nextInt();
        System.out.println("Müzik not:");
        muz=inp.nextInt();
        double ORT= (mat+fiz+kim+turk+tar+muz)/6;
        System.out.println( ORT>60 ? "\nsınıfı geçti" + ORT : "kaldı\n" + ORT);
        
        /*  boolean kosul = sonuc >= 60;
            String gectiMi = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
            System.out.println(gectiMi); */


    }
}
