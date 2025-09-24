// Calling Static Method inside Static Method:Can be called directly — no object needed

// Calling Static Method inside Instance Method:Can also be called directly — no object needed


class AvengerStatic {
    public static void main(String[] args) {
        AvengerStatic ironMan = new AvengerStatic();
        showPower();
        showName();
        ironMan.showTeam();        // we have to create object to call instance method.
        // ironMan.showPower();    // We don't need to call static method with object.
    }
    
    // Static method
    static void showName() {
        System.out.println("I am Iron Man.");
    }

    // Static method
    static void showPower() {
        System.out.println("Showing Avenger's Power!");
        showName();
    }
    
    // Instance method
    void showTeam() {
        System.out.println("We are Avengers!");
    }
}
