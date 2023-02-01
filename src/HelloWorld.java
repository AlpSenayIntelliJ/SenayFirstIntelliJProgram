import java.util.ArrayList;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args){
        ArrayList<String> alp = new ArrayList<String>();
        alp.add("Sports");
        alp.add("Spark");
        alp.add("SHake Shack");
        alp.add("Mr. FOlwell is the goat!!");
        System.out.println(alp);
        System.out.println(alp.size());
        String replacedStr = alp.set(0, alp.get(3));
        System.out.println(alp.get(0));
        System.out.println(replacedStr);
        alp.set(0, "HELLO!");
        System.out.println(alp);

    }
}
