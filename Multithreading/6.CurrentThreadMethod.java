package Multithreading;


// Class 1: Defines the thread
class CurrentThread extends Thread {
    public void run() {
        // currentThread() returns a reference to the currently executing thread
        System.out.println("Inside run() method: " + Thread.currentThread());
    }
}

// Class 2: Contains the main method
class CurrentThreadMethod {
    public static void main(String[] args) {
        // Print the name of the current thread (main thread)
        System.out.println("Inside main() method: " + Thread.currentThread());

        CurrentThread t1 = new CurrentThread(); // create thread object
        t1.start(); // start the new thread
    }
}
