class Printer {
    
    void print() {
        System.out.println("Nothing to print");
    }

    void print(String text) {
        System.out.println("Printing text: " + text);
    }

    void print(int number) {
        System.out.println("Printing number: " + number);
    }

    void print(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        p.print();
        p.print("Hello");
        p.print(123);
        p.print("Repeat", 3);
    }
}

