package Jobsheet5;
import java.util.Scanner;

public class PemilihanBilangan04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan angka: ");
        int angka = sc.nextInt();

        // ------ if else ------
        if (angka %2 == 0){
            System.out.println("Angka " + angka + " adalah bilangan genap");
        } else {
            System.out.println("Angka " + angka + " adalah bilangan ganjil");
        }
        
        //  ------ ternary ------
        String hasil;
        hasil = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
        System.out.println(angka + " adalah " + hasil);

        sc.close();
    }
}
