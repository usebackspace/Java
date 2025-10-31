package Multithreading;


// Class 1: This defines the thread
class StartMethodThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

// Class 2: This contains the main method
class StartMethod {
    public static void main(String[] args) {
        StartMethodThread t1 = new StartMethodThread(); // create thread object
        t1.start(); // start the thread (calls run() in a new thread)
        System.out.println("Main method is running...");
    }
}
