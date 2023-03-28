package fr.epita.files.datamodel;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(fruitName, fruit.fruitName) && Objects.equals(fruitColor, fruit.fruitColor) && Objects.equals(fruitCalories, fruit.fruitCalories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fruitName, fruitColor, fruitCalories);
    }

    /**/


}
