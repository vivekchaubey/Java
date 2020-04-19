package Threads;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread thread=new NewThread();
        thread.start();
    }

    private static class NewThread extends Thread
    {
        @Override
        public void run() {
            System.out.println("Hello from "+Thread.currentThread().getName());
        }
    }

}
