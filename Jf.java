public class Jf {
    
    public static void main(String[] args) {

       
        try{
            int x=100/2;
            System.out.println("value of x: "+x);

            int[] arr= new int[5];
            arr[13]=100;
            System.out.println("arr value:"+arr[3]);
            String s= null;
            System.out.println(s.length());

        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("cannot divided by zero");
        }
      
    
        System.out.println("program con");
    }
}
