package fr.epita.geometry.datamodel;

public class Triangle {

    private Double sideA;
    private Double sideB;
    private Double height;
    private Double base;


    public Triangle(Double sideA, Double sideB, Double height, Double base) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.base = base;
    }

    public Double getSideA() {
        return sideA;
    }

    public void setSideA(Double sideA) {
        this.sideA = sideA;
    }

    public Double getSideB() {
        return sideB;
    }

    public void setSideB(Double sideB) {
        this.sideB = sideB;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getArea(){
        return this.base * this.height / 2;
    }

    public Double getPerimeter(){
        return this.base + this.sideA + this.sideB;
    }
}
