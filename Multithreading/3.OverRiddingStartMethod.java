
package Multithreading;


class OverRiddingStart extends Thread {
    public void start() {  
        System.out.println("Running Start method: " );
    }

    public void run() {
        System.out.println("Running Run method: " );
    }
}

class OverRiddingStartMethod {
    public static void main(String[] args) {
        OverRiddingStart t1 = new OverRiddingStart();  // create thread object
        t1.start();  
        // t1.run();
        System.out.println("Main thread: " );
    }
}


// When we define the start() method then it will be override the start() method of Thread class which automatically call the run() method of the Thread class.