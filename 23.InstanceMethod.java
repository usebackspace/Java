// Calling Instance Method inside static method:- We cannot call instance method directly inside static method (main method) we have to create object of the class.

// Calling instance Method in Instance Method/ Nesting of Method:- Instance method can call an instance method directly. We don't need to create a object of the class. 

class Avengers {

    int x = 100;
    static int y = 200;

    public static void main(String[] args) {
        Avengers ironMan = new Avengers();
        ironMan.showPower();
        // showName();          // We cannot call instance method without object.
    }
    
    // If make below method static then we cannot access the value of x, as it is a instance variable.
    void showName() {
        System.out.println("I am Iron Man.");
        System.out.println("value of x: "+x+"value of y: "+y);
    }
    // Instance method
    void showPower() {
        System.out.println("Showing Avenger's Power!");
        showName();
    }
}
