package fr.epita.files.datamodel;

public class Fruit {
    private String fruitName;
    private String fruitColor;

    public String getFruitName() {
        return fruitName;
    }

    public String getFruitColor() {
        return fruitColor;
    }

    public Integer getFruitCalories() {
        return fruitCalories;
    }

    private Integer fruitCalories;

    public Fruit(String fruitName, String fruitColor, Integer fruitCalories) {
        this.fruitName = fruitName;
        this.fruitColor = fruitColor;
        this.fruitCalories = fruitCalories;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitName='" + fruitName + '\'' +
                ", fruitColor='" + fruitColor + '\'' +
                ", fruitCalories=" + fruitCalories +
                '}';
    }


}
