package Jobsheet5;
import java.util.Scanner;

public class PemilihanSwitch04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil = 0;
        char operator;

        System.out.println("Masukkan angka 1: ");
        angka1 = sc.nextDouble();
        System.out.println("Masukkan angka 2: ");
        angka2 = sc.nextDouble();
        System.out.println("Pilih operator (+ - * /)");
        operator = sc.next().charAt(0);

        // // ------ TANPA DEFAULT ------ 
        // switch (operator){
        //     case '+':
        //         hasil = angka1 + angka2;
        //         break;
        //     case '-':
        //         hasil = angka1 - angka2;
        //         break;
        //     case '*':
        //         hasil = angka1 * angka2;
        //         break;
        //     case '/':
        //         hasil = angka1 / angka2;
        //         break;
        // } System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);

        // ------ DENGAN DEFAULT ------
        switch (operator){
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
                break;
            default:
                System.out.println("invalid operator");;
        }
        
        sc.close();
    }
}
