package Test1;

import java.time.LocalDate;
import java.util.Date;

public class RunBusA implements Runnable{
    private LockMethod lockMethod;
     RunBusA(LockMethod busA){
        lockMethod = busA;
    }
    @Override
    public void run() {
        try {
            lockMethod.BusA();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
