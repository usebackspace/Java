package superr;


class A {
    String color = "White";
}

class B extends A {
    String color = "Black"; // hides parent variable

    void show() {
        System.out.println(color);        // child variable
        // System.out.println(super.color);  // parent variable
    }
}

public class Super_3 {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}