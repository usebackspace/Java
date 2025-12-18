package exception;


import java.io.FileReader;
import java.io.FileNotFoundException;

class Throws_Concept {

    static void readFile() throws FileNotFoundException {
        FileReader fr = new FileReader("exception\\fil.txt");
        System.out.println("File opened successfully.");
    }

    // static void readFile() {
    //     try{
    //         FileReader fr = new FileReader("exception\\fil.txt");
    //         System.out.println("File opened successfully.");
    //     }
    //     catch(FileNotFoundException e){
    //         System.out.println("File not found: ");
    //     }
    // }

    public static void main(String[] args){
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: ");
        }


        // readFile();                // throws FileNotFoundException  we have to add in main  method
    }
}
