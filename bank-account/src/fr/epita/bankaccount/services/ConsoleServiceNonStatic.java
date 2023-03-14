package fr.epita.bankaccount.services;

import fr.epita.bankaccount.datamodel.Customer;
import fr.epita.bankaccount.datamodel.Stock;

import java.util.Scanner;

public class ConsoleServiceNonStatic {


    private final Scanner scanner;

    public ConsoleServiceNonStatic(Scanner scanner){
        this.scanner = scanner;
    }

    public Stock createStockFromUserInput() {
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

    public  Customer createCustomerFromUserInput() {
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
