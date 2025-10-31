package Multithreading;

class JoinThread extends Thread{

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

class JoinMethod {
    public static void main(String[] args) throws InterruptedException{
        
       JoinThread t1 = new JoinThread();
       t1.start();
    // t1.join();
       t1.join(5000);


       for(int i=1;i<=5;i++){
            System.out.println("Main Thread: "+i);
        }
    }
}

// Join() method also throw InterruptedException.

// Normally we write join() method who is waiting, Here main method is waiting to join t1 object that why we are writing t1.join(). After the t1 completed is execution then it will join.

// join(5000) : Means it will wait for 5 sec after that it will join the thread.