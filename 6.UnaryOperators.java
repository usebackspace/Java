class UnaryOperators {
    public static void main(String[] args) {
        int a = 5;

        // Unary minus
        int negative = -a;
        System.out.println("Unary minus (-a): " + negative);  // -5

        // Unary plus (has no effect on positive numbers)
        int positive = +a;
        System.out.println("Unary plus (+a): " + positive);  // 5

        // Increment (prefix and postfix)
        System.out.println("Original a: " + a);
        System.out.println("Post-increment (a++): " + (a++));  // prints 5, then a becomes 6
        System.out.println("After post-increment, a: " + a);   // 6

        System.out.println("Pre-increment (++a): " + (++a));   // increments to 7, then prints 7

        // Decrement (prefix and postfix)
        System.out.println("Post-decrement (a--): " + (a--));  // prints 7, then a becomes 6
        System.out.println("After post-decrement, a: " + a);   // 6

        System.out.println("Pre-decrement (--a): " + (--a));   // decrements to 5, then prints 5

     
    }
}
