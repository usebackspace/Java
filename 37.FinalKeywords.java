class FinalKeywords {
    

    public static void main(String[] args) {
        A a = new A();
        // a.show();

        B b = new B();
        // b.show();
        b.staticshow();
    }
}


// final class A {              // Cannot inherit the class
class A {

    // final int y=10;
    // final int y;            // cannot be intialzed, intialize can be done only in class Constructor
    int y;

    // A(){
    //     y=200;
    // }

    //  final void show(){     // cannot overide the method
    void show(){
        y=20;
        System.out.println("value of y: "+y);
        System.out.println("This is a class A");
    }
}

class B extends A{

    // static final int z=100;
    // static final int z;        // cannot be intialzed, intialize can be done only inside static block
    int z;
    // static{
    //     z=500;
    // }

    void staticshow(){
        // z=20;
        System.out.println("Value of z: "+z);
    }

    void show(){
        // final int x=10;     // We Cannot reassign
        int x=10;
        x=100;
        System.out.println("value of x: "+x);
        System.out.println("This is a class B");
    }
}