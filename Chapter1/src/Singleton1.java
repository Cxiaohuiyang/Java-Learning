public class Singleton1 {
    private static Singleton1 instance = null;

    private Singleton1() {
    }
    public synchronized static  Singleton1 getInstance() {
            if(instance == null) {
                System.out.println("---------init--------");
                instance = new Singleton1();
            }
            return instance;

    }

    public  void Print(){
        System.out.println("---------Print--------");
    }

//    private static Singleton instance = null;
//    private Singleton() {}
//    public static synchronized Singleton getInstance(){
//        if (instance == null) instance ＝ new Singleton();
//        return instance;
//    }
}
