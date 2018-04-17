package Test1;

public class TestLockMethod {
    public static void main(String[] agrs){

        LockMethod lockMethod = new LockMethod();

        Thread threadA = new Thread( new RunBusA(lockMethod));
        Thread threadB = new Thread( new RunBusB(lockMethod));
        threadB.start(); threadA.start();
    }
}
