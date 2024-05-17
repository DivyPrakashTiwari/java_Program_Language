// Class r implements the Runnable interface, allowing it to be executed in a separate thread
class r implements Runnable {
    // The run() method contains the code to be executed in the thread
    public void run() {
        // Loop from 1 to 5, printing the current thread ID and loop iteration
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": " + i);
            try {
                // Pause the current thread for 1000 milliseconds (1 second)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// The main class j1 contains the main method, which is the entry point for the application
public class threads {
    // The main method creates two instances of the r class and starts two threads to execute them
    public static void main(String[] args) {
        r r1 = new r();
        r r2 = new r();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}