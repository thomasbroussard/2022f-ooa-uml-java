package fr.epita.bankaccount.launcher;

import fr.epita.bankaccount.datamodel.Customer;
import fr.epita.bankaccount.datamodel.Stock;

import java.io.InputStream;
import java.util.Scanner;

public class UserInputLauncher {

    public static void main(String[] args) {
        InputStream input = System.in;

        Scanner scanner = new Scanner(System.in);
        Customer customer = createCustomerFromUserInput(scanner);

        Stock stock = createStockFromUserInput(scanner);

    }

    private static Stock createStockFromUserInput(Scanner scanner) {
        System.out.println("please input a stock name");
        String stockName = scanner.nextLine();
        System.out.println("please input a stock current value (float)");
        String rawStockValue = scanner.nextLine();
        Double stockValue = Double.parseDouble(rawStockValue);
        Stock stock = new Stock();
        stock.setCurrentValue(stockValue);
        stock.setName(stockName);
        System.out.println(stock);
        return stock;
    }

    private static Customer createCustomerFromUserInput(Scanner scanner) {
        System.out.println("Please enter a customer name");
        String name = scanner.nextLine();
        System.out.println("the customer name is : " + name);
        System.out.println("Please enter the customer address");
        String address = scanner.nextLine();
        System.out.println("the customer address is : " + address);
        Customer customer = new Customer(name, address);

        System.out.println("created customer: "+ customer);
        return customer;
    }
}
