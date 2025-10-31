package Multithreading;

class Priority extends Thread{
    public void run(){
        System.out.println("Priority inide run() :"+Thread.currentThread().getPriority());
    }
}

class ThreadPriority {
    public static void main(String[] args) {

        System.out.println("Min Priority: "+ Thread.MIN_PRIORITY);
        System.out.println("Max Priority: "+ Thread.MAX_PRIORITY);
        System.out.println("Norm Priority: "+ Thread.NORM_PRIORITY);

        System.out.println("Main priority Before: "+ Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(8);
        System.out.println("Main priority After: "+ Thread.currentThread().getPriority());


        Priority t1 = new Priority();
        // t1.setPriority(3);    // If we don't set the priority it will inherit the main thread priority
        t1.start();
    }
}
