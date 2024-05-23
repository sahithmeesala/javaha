public class StaticMethodThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(StaticMethodExample::method1);
        Thread thread2 = new Thread(StaticMethodExample::method2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void method1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Method 1 - iteration: " + i + " by Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method2() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Method 2 - iteration: " + i + " by Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
