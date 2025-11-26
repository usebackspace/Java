package superr;

class A {
    void show() {
        System.out.println("Show method called of Class A ");
    }
}

class B extends A {
     void show() {
         super.show();
         System.out.println("Show method called of Class B ");
    }
}

public class Super_4 {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}