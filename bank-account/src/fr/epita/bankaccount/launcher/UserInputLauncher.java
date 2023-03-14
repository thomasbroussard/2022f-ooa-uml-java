package fr.epita.bankaccount.launcher;

import java.io.InputStream;
import java.util.Scanner;

public class UserInputLauncher {

    public static void main(String[] args) {
        InputStream input = System.in;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String name = scanner.nextLine();
        System.out.println("your name is : " + name);

    }
}
