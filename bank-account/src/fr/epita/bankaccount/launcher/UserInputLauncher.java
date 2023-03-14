package fr.epita.bankaccount.launcher;

import fr.epita.bankaccount.datamodel.Customer;

import java.io.InputStream;
import java.util.Scanner;

public class UserInputLauncher {

    public static void main(String[] args) {
        InputStream input = System.in;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a customer name");
        String name = scanner.nextLine();
        System.out.println("the customer name is : " + name);
        System.out.println("Please enter the customer address");
        String address = scanner.nextLine();
        System.out.println("the customer address is : " + address);
        Customer customer = new Customer(name, address);

        System.out.println("created customer: "+ customer);


    }
}
