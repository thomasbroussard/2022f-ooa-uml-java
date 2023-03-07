package fr.epita.bankaccount.datamodel;

public class Stock {

    private String name;
    private Double currentValue;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()){
            return;
        }
        this.name = name;
    }

    public Double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Double currentValue) {
        if (currentValue == null || currentValue < 0){
            return;
        }
        this.currentValue = currentValue;
    }
}
