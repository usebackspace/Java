

package Multithreading;

// Class 1: Defines the thread
class SetNameThread extends Thread {
    public void run() {
        // Print the name of the currently executing thread
        System.out.println("Inside run() method: " + Thread.currentThread().getName());
    }
}

// Class 2: Contains the main method
class SetNameMethod {
    public static void main(String[] args) {
        // Print the name of the main thread
        System.out.println("Before Changing name in main() method: " + Thread.currentThread().getName());
        Thread.currentThread().setName("Avenger");
        System.out.println("After Changing name in main() method: " + Thread.currentThread().getName());

        // Create first thread object
        SetNameThread t1 = new SetNameThread();
        // Set a custom name for the thread
        t1.setName("Steve");

        // Create second thread object
        GetNameThread t2 = new GetNameThread();
        t2.setName("Tony");

        // Start the threads
        t1.start();
        t2.start();

        // Print the thread names (after setting)
        System.out.println("Thread t1 name: " + t1.getName());
        System.out.println("Thread t2 name: " + t2.getName());
    }
}
