package Jobsheet5;
import java.util.Scanner;

public class LampuLalin04 {
    public static void main(String[] args) {
        int lampu;
        Scanner sc = new Scanner(System.in);

        System.out.println("Apa warna lampu merah sekarang?");
        System.out.println("1. Merah\n2. Kuning\n3. Hijau");
        System.out.print("Input dalam angka: ");
        lampu = sc.nextInt();

        if (lampu == 1) {
            System.out.println("Berhenti");
        } else if (lampu == 2) {
            System.out.println("Hati-hati");
        } else if (lampu == 3) {
            System.out.println("Jalan");
        } else {
            System.out.println("Invalid");
        }
        sc.close();
    }
}
