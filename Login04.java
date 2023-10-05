package Jobsheet5;
import java.util.Scanner;

public class Login04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String username, password;

        System.out.println("Masukkan username: ");
        username = sc.nextLine();
        System.out.println("Masukkan password: ");
        password = sc.nextLine();

        if (username.equals("thisisme") && password.equals ("halo123")){
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }
        sc.close();
    }
}
