class LogicalOperators {
    public static void main(String[] args) {
        // Logical AND
        boolean x = true;
        boolean y = false;
        boolean resultAnd = x && y;
        System.out.println("Logical AND: " + resultAnd);

        // Logical OR
        boolean resultOr = x || y;
        System.out.println("Logical OR: " + resultOr);

        // Logical NOT
        boolean resultNotX = !x;
        boolean resultNotY = !y;
        System.out.println("Logical NOT for x: " + resultNotX);
        System.out.println("Logical NOT for y: " + resultNotY);


    }
}
