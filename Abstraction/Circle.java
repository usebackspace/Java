package Abstraction;

class Circle extends Shape {
    
    private double raidus;

    Circle(double raidus){
        this.raidus=raidus;
    }

    double area(){
        return 3.14*raidus*raidus;
    }

    double perimeter(){
        return 2* 3.14*raidus;
    }

}
