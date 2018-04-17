package Test1;

import static java.lang.Thread.sleep;

 class LockMethod {
    private final Object age = 0 ;
      void BusA() throws InterruptedException {
        System.out.println("A start" + System.currentTimeMillis());
        synchronized(age){
            sleep(1000);
        }
        System.out.println("A stop" + System.currentTimeMillis());

    }
     synchronized  void BusB() throws InterruptedException {
        System.out.println("B start" + System.currentTimeMillis());
       // synchronized(age){
            sleep(1000);
       // }
         System.out.println("B stop" + System.currentTimeMillis());
    }
}
