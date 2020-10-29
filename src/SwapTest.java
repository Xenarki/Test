public class SwapTest {
    public static void main(String[] args) throws Exception {
        TestSwap ob1 = new TestSwap(1);
        TestSwap ob2 = new TestSwap(2);

        ob1.swap(ob2);
        System.out.println("ob1.a:" + ob1.a);
        System.out.println("ob2.a:" + ob2.a);
    }
}
