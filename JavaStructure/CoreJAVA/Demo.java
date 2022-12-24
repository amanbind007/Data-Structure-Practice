//package CoreJAVA;

class Display {
    public synchronized void displayn() {
        for (int i = 0; i < 5; i++) {

            System.out.println("Num : " + i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // System.out.println(name);
        }

    }

    public synchronized void displayc() {
        for (int i = 65; i <= 75; i++) {

            System.out.println("Character : " + (char) i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class MyThread1 extends Thread {
    Display d;

    MyThread1(Display d) {
        this.d = d;
    }

    public void run() {
        d.displayn();
    }
}

class MyThread2 extends Thread {
    Display d;

    MyThread2(Display d) {
        this.d = d;

    }

    public void run() {
        d.displayc();
    }
}

class SynchronizedDemo {
    public static void main(String[] args) {
        Display d1 = new Display();
        // Display d2 = new Display();
        MyThread1 t1 = new MyThread1(d1);
        MyThread2 t2 = new MyThread2(d1);
        // MyThread t3 = new MyThread(d, "Kohli");
        // MyThread t4 = new MyThread(d, "Raina");
        t1.start();
        t2.start();
        int i = null;
        // t3.start();
        // t4.start();
    }
}
