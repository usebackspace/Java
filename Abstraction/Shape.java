package Abstraction;

public abstract class Shape {

    abstract double area();
    abstract double perimeter();

    void show(){
        System.out.println("Which shape will you like to draw");
    }

}
