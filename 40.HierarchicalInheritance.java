// Parent class or Base Class or Super Class
class Parent {
    void parentProperty() {
        System.out.println("parent's property");
    }
}

// Brother class or Derived class
class Brother extends Parent {
    void brotherProperty() {
        System.out.println("Brother's property");
    }
}

// Sister class or Derived class
class Sister extends Parent {
    void sisterProperty() {
        System.out.println("Sister's property");
    }
}

// Main class to run the program
class HierarchicalInheritance {
    public static void main(String[] args) {
        // Creating an instance of the Brother class
        Brother b = new Brother();
        b.brotherProperty();
        // b.sisterProperty(); // Error: Brother cannot access Sister's methods
        b.parentProperty();

        System.out.println();

        // Creating an instance of the Sister class
        Sister s = new Sister();
        s.sisterProperty();
        // s.brotherProperty(); // Error: Sister cannot access Brother's methods
        s.parentProperty();

        System.out.println();

        // Creating an instance of the Parent class
        Parent p = new Parent();
        p.parentProperty();
        // p.brotherProperty(); // Error: Parent cannot access child class methods
        // p.sisterProperty();  // Error: Same here
    }
}
