public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        Singleton1.getInstance().Print();
    }
}
