class TwoDCharArray {
    public static void main(String[] args) {
        // Declaration and Allocation of 3x3 2D char Array
        char[][] grid = new char[3][3];

        // Assigning values manually
        grid[0][0] = 'A';
        grid[0][1] = 'B';
        grid[0][2] = 'C';

        grid[1][0] = 'D';
        grid[1][1] = 'E';
        grid[1][2] = 'F';

        grid[2][0] = 'G';
        grid[2][1] = 'H';
        grid[2][2] = 'I';

        // You could also do:
        // char[][] grid = {
        //     {'A', 'B', 'C'},
        //     {'D', 'E', 'F'},
        //     {'G', 'H', 'I'}
        // };
        
        System.out.println("Length of Row: " + grid.length);
        System.out.println("Length of Column: " + grid[0].length);
        System.out.println("=====================");
        
        System.out.println("Accessing 2D Char Array Through Index:");
        System.out.println("Element at [1][2] = " + grid[1][2]);  // Output: F
        System.out.println("=====================");

        System.out.println("Accessing 2D Char Array Through Nested For-Loop:");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=====================");

        System.out.println("Accessing 2D Char Array Through Enhanced For-Loop:");
        for (char[] row : grid) {
            for (char value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
