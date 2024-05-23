package homeWork;

import java.util.Scanner;

public class Menu {
    public static int  menu(){
        System.out.println("=".repeat(150));
        System.out.println("1.Add New Course");
        System.out.println("2.List Courses");
        System.out.println("3.Find Course BY ID");
        System.out.println("4.Find Course BY Title");
        System.out.println("5.Remove Course BY ID ");
        System.out.println("0/.99.Exit");
        System.out.println("==================================");
        System.out.println("=".repeat(150));
        System.out.println("[+] Insert OPTION = ");
        return new Scanner(System.in).nextInt();
    }
}
