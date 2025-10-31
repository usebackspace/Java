package Multithreading;

class PriorityExe extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

class PriorityExample {
    public static void main(String[] args) {
        
        PriorityExe t1 = new PriorityExe();
        // t1.setPriority(8);     
        t1.start();

        for(int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}

// Output will not be expected output as Some platorm and OS are there which doesn't Support priority and setPriority.

