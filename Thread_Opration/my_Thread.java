// Class representing a custom thread, named MyThread
class MyThread extends Thread {

    // Method to be executed when the thread is started
    // Prints a message indicating that the thread is running
    public void run() {
        System.out.println("Thread running");
    }
}

public class my_Thread {

    // Main method to start the execution of the program
    public static void main(String[] args) {

        // Create an instance of the custom thread, named myThread
        MyThread myThread = new MyThread();

        // Start the execution of the custom thread
        myThread.start();
    }
}