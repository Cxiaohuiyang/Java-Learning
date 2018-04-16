import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import static  java.lang.System.out;
public class Main {
    public  static  void  main(String[] argus)  {
        Persion persion = new Persion();

        out.println(persion.getClass() == Persion.class);
    }
}
