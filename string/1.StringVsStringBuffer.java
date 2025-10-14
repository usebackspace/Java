package string;

class StringVsStringBuffer {
    public static void main(String[] args) {

        // --- Using String (Immutable) ---
        String aven;
        String str = "Avenger";
        System.out.println("Original String: " + str);

        str.concat(" Assemble"); // This does NOT change the original string
        System.out.println("After concat (String): " + str); // Output: Avenger

        // To change the value, we need to assign it
        aven = str.concat(" Assemble");
        System.out.println("After assigning concat result: " + aven); // Output: Avenger Assemble

        // --- Using StringBuffer (Mutable & Thread-safe) ---
        StringBuffer sb = new StringBuffer("Avenger");
        System.out.println("\nOriginal StringBuffer: " + sb);

        sb.append(" Assemble"); // This modifies the same object
        System.out.println("After append (StringBuffer): " + sb); // Output: Avenger Assemble

    }
}
