package Threads;

public class FirstThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("we are in thread "+Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getPriority());
            }
        });

        thread.setName("vivek");
        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("we are in threat "+Thread.currentThread().getName()+" before start");
        thread.start();
        System.out.println("we are in threat "+Thread.currentThread().getName()+" after start");

        Thread.sleep(2000);
    }
}
