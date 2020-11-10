public class ExtendThread {
    public static void main(String[] args){
        System.out.println("Main thread start");
        MyThread mt = new MyThread("Thread 1");
        mt.start();
        for (int i = 0; i < 50; i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException exc){
                System.out.print("Thread exit");
            }
        }
        System.out.println("Main thread exit");
    }
}
