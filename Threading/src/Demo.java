//class MyTask implements Runnable{
//    public String task;
//    public int times;
//
//    public MyTask(String task, int times) {
//        this.task = task;
//        this.times = times;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < times; i++) {
//            System.out.println(this.task);
//        }
//    }
//}


class MyThread extends Thread {
    public String task;
    public int times;

    public MyThread(String task, int times) {
        this.task = task;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(this.task);
        }
    }
}

public class Demo {

    public static void main(String[] args) {
//        MyTask myTask1 = new MyTask("A", 1000);
//        Thread thread1 = new Thread(myTask1);
//        MyTask myTask2 = new MyTask("________B", 1000);
//        Thread thread2 = new Thread(myTask2);
//        thread1.start();
//        thread2.start();

        Thread myThread1 = new MyThread("A", 70);
        Thread myThread2 = new MyThread("_____B", 70);
        myThread1.start();
        myThread2.start();
    }
}
