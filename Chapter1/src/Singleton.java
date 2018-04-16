public class Singleton {

    public static Singleton getInstance() {
        return instance;
    }
    public  void Print(){
        System.out.println("---------Print--------");
    }
    private static  Singleton instance;
     static{
         System.out.println("instanceinstanceinstanceinstance");
         instance = new Singleton();
    };
}
