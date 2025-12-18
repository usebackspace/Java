package exception;

//  Multiple try catch block

class Concept_2 {
    public static void main(String[] args) {

        try {
            int a = 10 / 2;      
            // int a = 10 / 0;       
            System.out.println("value of a: "+a);

            int[] arr = new int[2];
            arr[1] = 10;         
            // arr[3] = 10;         
            System.out.println("Value of Array: "+arr[1]);

            String s ="Avenger";
            // String s =null;
            System.out.println("Length of String: "+ s.length());

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic Exception");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array index out of range");
        }
        catch( NullPointerException e){
            System.out.println("Cannot Find the Length of the String");
        }

    }
}

// If there is multiple exception in one program it will handle one exception at a time, if one exception get resolved then it will be go for second exception and so on.