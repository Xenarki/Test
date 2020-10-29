public class OverloadDemo {
    public static void main(String args[]) {
        Overload ob = new Overload();
        int resI;
        int resD;

        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2, 3);
        System.out.println();
    }
}
