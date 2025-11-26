package superr;

class A {
    A(){
        System.out.println("Parent constructor");
    }
}

class B extends A {
    B(){
        // super(); // explicitly calling parent constructor
        System.out.println("Child constructor");
    }
}

public class Super_1 {
    public static void main(String[] args) {
        B b = new B();
    }
}
