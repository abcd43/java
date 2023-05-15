public class Current_Thread {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Current thread name: " + thread.getName());
        
        // Creating new threads
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());
        
        // Starting new threads
        thread1.start();
        thread2.start();
    }
}

class MyRunnable implements Runnable 
{
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println("Thread name: " + thread.getName());
    }
}
