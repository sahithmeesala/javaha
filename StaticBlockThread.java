public class StaticBlockThread {
    static {
        System.out.println("Static block executed by Thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(StaticBlockExample::staticMethod);

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 running...");
            staticMethod();
        });

        thread1.start();
        thread2.start();
    }

    private static void staticMethod() {
        System.out.println("Static method executed by Thread: " + Thread.currentThread().getName());
    }
}
