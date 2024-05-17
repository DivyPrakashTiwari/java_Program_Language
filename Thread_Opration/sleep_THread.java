// Class representing a custom thread
class MyThread extends Thread {

    // Method to be executed when the thread is started
    public void run() {
        System.out.println("Thread running");
    }
}

public class sleep_THread {
    public static void main(String[] args) throws InterruptedException {

        // Initialize a new instance of the custom thread
        MyThread myThread = new MyThread();

        // Print the alive status of the thread before starting it
        System.out.println("Before starting thread: " + myThread.isAlive());

        // Start the custom thread
        myThread.start();

        // Print the alive status of the thread after starting it
        System.out.println("After starting thread: " + myThread.isAlive());

        // Wait for the thread to complete (1000 milliseconds)
        Thread.sleep(1000);

        // Print the alive status of the thread after it has completed
        System.out.println("After thread completes: " + myThread.isAlive());
    }
}