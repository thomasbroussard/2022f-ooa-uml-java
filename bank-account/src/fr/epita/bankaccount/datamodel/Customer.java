package fr.epita.bankaccount.datamodel;

public class Customer {
    //visibility levels
    //private : accessible for the class onmy
    //public : accessible to all places in the project
    //protected : accessible to all classes in the same package and for inheritance
    //(nothing) : accessible to all classes in the same package


    private String name;
    private String address;


    public Customer(){
    }

    public Customer(String initialName, String initialAddress) {
        if (checkNotNull(initialName) && checkNotNull(initialAddress)) {
            this.address = initialAddress;
            this.name = initialName;
        } else {
            throw new IllegalArgumentException("initialName or initialAddress invalid for customer");
        }

    }



    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        if (checkNotNull(newName)) return;
        this.name = newName;
    }

    private static boolean checkNotNull(String value) {
       return !(value == null || value.isBlank());
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
