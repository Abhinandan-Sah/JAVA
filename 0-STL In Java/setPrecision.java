import java.util.*;
public class setPrecision{
    public static void main(String[] args) {
        Formatter f1, f2, f3;
       f1 = new Formatter();
       f1.format("%1.3f", 29292929.98765432);
       System.out.println(f1);
       f2 = new Formatter();
       f2.format("%1.7f", 29292929.98765432);
       System.out.println(f2);
       f3 = new Formatter();
       f3.format("%1.9f", 29292929.98765432);
       System.out.println(f3);
    }
}