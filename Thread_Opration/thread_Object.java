public class thread_Object {
    public static void main(String[] args) {
        // Get the current thread
        Thread currentThread = Thread.currentThread();

        // Print the name of the current thread
        System.out.println("Current thread: " + currentThread.getName());
    }
}