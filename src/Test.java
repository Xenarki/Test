import java.security.MessageDigest;

public class Test {
    public static void main(String[] args) throws Exception {
        int num[] = {34, 32, 34, 12, 6, 10, 3};
        int t;
        for(int i = 1; i < num.length; i++){
            for(int j = num.length - 1; j >= i; j--){
               if(num[j-1] > num[j]) {
                 t = num[j-1];
                    num[j-1] = num[j];
                    num[j] = t;
                }
            }
        }
        for(int i = 0; i < num.length; i++){
            System.out.print("" + num[i] + ";");
        }
    }
}