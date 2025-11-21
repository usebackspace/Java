package Abstraction;

public class Main {
    
    public static void main(String[] args) {

        //  Area and Permiter for rectangle
        Rectangle r = new Rectangle(4, 5);
        r.area();
        System.out.println("Area of Rectangle is :"+ r.area());
        System.out.println("Perimeter of Rectangle is :"+ r.perimeter());
        
        
        // Area and Perimeter for circle
        Circle c = new Circle(4);
        System.out.println("Area of Rectangle is :"+ c.area());
        System.out.println("Perimeter of Rectangle is :"+ c.perimeter());

    }
}
