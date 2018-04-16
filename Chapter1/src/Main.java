public class Main {
    public  static  void  main(String[] argus){
        MyThread myThread = new MyThread();

        Thread thread = new Thread(myThread);
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);
        thread.start();
        thread1.start();
        thread2.start();
    }
}
