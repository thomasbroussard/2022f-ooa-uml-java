package fr.epita.bankaccount.launcher;

import fr.epita.bankaccount.datamodel.Customer;
import fr.epita.bankaccount.datamodel.Stock;
import fr.epita.bankaccount.services.ConsoleService;
import fr.epita.bankaccount.services.ConsoleServiceNonStatic;

import java.io.InputStream;
import java.util.Scanner;

import static fr.epita.bankaccount.services.ConsoleService.*;

public class UserInputLauncher {

    String testProp = "";
    public static void main(String[] args) {
        InputStream input = System.in;

        Scanner scanner = new Scanner(System.in);
        Customer customer = ConsoleService.createCustomerFromUserInput(scanner);
        Stock stock = ConsoleService.createStockFromUserInput(scanner);


        ConsoleServiceNonStatic consoleService = new ConsoleServiceNonStatic(scanner);
        Customer customer2 = consoleService.createCustomerFromUserInput();
        Stock stock2 = consoleService.createStockFromUserInput();




    }



}
