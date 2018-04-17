package Test1;

public class RunBusB implements Runnable{
    private LockMethod lockMethod;
    RunBusB(LockMethod busB){
        lockMethod = busB;
    }
    @Override
    public void run() {
        try {
            lockMethod.BusB();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
