package Jobsheet5;
import java.util.Scanner;

public class Weapon04 {
    public static void main(String[] args) {
        double jarak;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jarak dalam meter:");
        jarak = sc.nextDouble();

        if (jarak <= 5) {
            System.out.println("Melee weapon ");
        } else {
            System.out.println("Ranged Weapon");
        }

        sc.close();
    }
}
