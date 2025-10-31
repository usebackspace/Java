package Multithreading;

class SleepThread extends Thread{

    public void run(){
        try{

            for(int i=1;i<=5;i++){
                System.out.println("Sleep count:"+i);
                Thread.sleep(2000,100);
            }
        }
        catch (InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}

class SleepMethod {
    public static void main(String[] args) throws InterruptedException{
        
       SleepThread t1 = new SleepThread();
       t1.start();
    }
}

//  Using throws (AS run() can’t declare throws)

// class SleepMethod {
//     public static void main(String[] args) throws InterruptedException{
        
//         for(int i=1;i<=5;i++){
//             System.out.println("Sleep count:"+i);
//             Thread.sleep(2000,100);
//         }
//     }
// }

