package CollegeProjects;

import java.util.Scanner;

public class java_15 {
    public static void main(String[] args) throws InterruptedException {
        subClass subObj = new subClass();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    subObj.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    subObj.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }
}

class subClass {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("producer thread running");
            wait();
            System.out.println("Resumed");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(1000);
        Scanner s = new Scanner(System.in);

        synchronized (this) {
            System.out.println("Waiting for return key.");
            s.nextLine();
            System.out.println("Return key pressed");
            notify();
            Thread.sleep(2000);
        }
    }
}