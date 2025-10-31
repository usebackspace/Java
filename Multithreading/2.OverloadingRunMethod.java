

package Multithreading;


class RunOverload extends Thread {
    public void run() {
        
        System.out.println("Run method without parameter: " );
    }

    public void run(int i) {
        System.out.println("Run method with parameter: "+ i );
    }
}

class OverloadingRunMethod {
    public static void main(String[] args) {
        RunOverload t1 = new RunOverload();  // create thread object
        t1.start();  // It will run the run() method of wihtout parameter.

        // t1.run();   // It will simply run the run() method  not the thread.
        // t1.run(10);
        
        System.out.println("Main thread: " );
    }
}


// CMD - javap java.lang.Thread