package fr.epita.bankaccount.launcher;

import fr.epita.bankaccount.datamodel.Customer;

public class MainLauncher {

    public static void main(String[] args) {
        System.out.println("Hello to the bank account application");

        //beforehand (without classes and OOP) we needed to repeat the initialization actions, and each variable
        //is independent of each other

//        String name = "";// take it from the user
//        String address = "";// take it from the user

//        String name2 = "";
//        String address2 ="";

        Customer thomas = new Customer();
        //thomas initialization (name and address)
        thomas.setName("");

//        thomas.address = "Paris";
//        thomas.name = "";


    }

}
