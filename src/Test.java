import java.security.MessageDigest;
import java.security.SecureRandom;

public class Test {
    public static void main(String[] args) throws Exception {

        System.out.println("Init ob1");
        Stack ob1 = new Stack(10);

      for(int i = 0; i < 10; i++){
          ob1.push((char) ('A' + i));
      }

      System.out.println("Init ob2");
      char name[] = {'s', 'f', 'q', 'e'};
      Stack ob2 = new Stack(name);

      System.out.println("Init ob3");
      Stack ob3 = new Stack(ob1);

      System.out.println("Вывод стека ob1: ");
      for(int i = 0; i < 10; i++){
          char ch = ob1.pop();
          System.out.print(ch);
      }
      System.out.println("\n");

        System.out.println("Вывод стека ob2: ");
        for(int i = 0; i < 3; i++){
            char ch = ob2.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Вывод стека ob3: ");
        for(int i = 0; i < 10; i++){
            char ch = ob3.pop();
            System.out.print(ch);
        }

        System.out.println("\n");
    }
}