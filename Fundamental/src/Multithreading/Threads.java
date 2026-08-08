package Multithreading;

public class Threads {
    public void run(){
        Thread t1 = new Thread(() -> {
            for(int i = 1; i <= 5; i++) {
                System.out.println(
                        "Thread A : " + i
                );
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 1; i <= 5; i++) {
                System.out.println(
                        "Thread B : " + i
                );
            }
        });
        //SLEEP THREAT
        Thread t3 = new Thread(() -> {
            for(int i = 1; i <= 5; i++) {
                System.out.println(
                        "Thread C : " + i
                );
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
