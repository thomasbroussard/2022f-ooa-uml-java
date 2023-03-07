package fr.epita.bankaccount.datamodel;

public class Customer {
    //visibility levels
    //private : accessible for the class onmy
    //public : accessible to all places in the project
    //protected : accessible to all classes in the same package and for inheritance
    //(nothing) : accessible to all classes in the same package

    private String name;
    private String address;



    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        if (newName == null || newName.isBlank()){
            return;
        }
        this.name = newName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
