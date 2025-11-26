package superr;

class A {
    A(int x) {
        System.out.println("Parent with value: " + x);
    }
}

class B extends A {
    B() {
        super(100); // must call explicitly
        System.out.println("Child constructor");
    }
}

public class Super_2 {
    public static void main(String[] args) {
        B b = new B();
    }
}