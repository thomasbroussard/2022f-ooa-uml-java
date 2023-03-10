package fr.epita.bankaccount.launcher;

import fr.epita.bankaccount.datamodel.Customer;
import fr.epita.bankaccount.datamodel.Stock;

public class MainLauncher {

    public static void main(String[] args) {
        System.out.println("Hello to the bank account application");

        //beforehand (without classes and OOP) we needed to repeat the initialization actions, and each variable
        //is independent of each other

//        String name = "";// take it from the user
//        String address = "";// take it from the user

//        String name2 = "";
//        String address2 ="";

        //lazy initialization of customer instance
        Customer thomas = new Customer();
        //thomas initialization (name and address)
        thomas.setName("Thomas");
        thomas.setAddress("Paris");
        System.out.println("created customer: " + thomas.getName() + ", address: " + thomas.getAddress());

        //"eager" initialization of customer instance
        Customer anotherCustomer = new Customer("Quentin", "Paris");
        System.out.println("created customer: " + anotherCustomer.getName() + ", address: " + anotherCustomer.getAddress());


        Customer invalidCustomer = new Customer("", "");


        //stock creation
        Stock gold = new Stock();
        gold.setName("gold");
        gold.setCurrentValue(10.0);

        System.out.println("created stock: "+ gold.getName() + ", currentValue: " + gold.getCurrentValue());

    }

}
