

public class test {
    public  static void main(String[] agrs){

        int i = 1;
        Integer ii = 1;
        System.out.println(i== ii);

        System.out.println(12L == new Integer(12));
        System.out.println(12F == new Integer(12));
        System.out.println(1222111111 == new Integer(1222111111));



        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);


        Integer a1 = 127;
        Integer b1 = 127;
        System.out.println(a1 == b1);

        Integer a2 = new Integer(1);
        Integer b2 = 1;
        int c2 = 1;
        System.out.println("a2 == b2" + ( a2 == b2));
        System.out.println("a2 == c2" + (a2 == c2));
        System.out.println("b2 == c2" + (b2 == c2));


        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;

        System.out.println(f1 == f2);
        System.out.println(f3 == f4);


        System.out.println("--------------------------String------------------------------------");
        String str1 = new String("xxxxxxxxxxxxxx");
        String str2 = "xxxxxxxxxxxxxx";
        System.out.println(str2.hashCode() == str1.hashCode());
    }
}
