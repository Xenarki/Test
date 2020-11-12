public class UseMain {
    public static void main(String[] args){
        Thread thrd;
        thrd = Thread.currentThread();
        System.out.println("Thread main name:" + thrd.getName());
        System.out.println("Thread Priority:" + thrd.getPriority());
        System.out.println();
        System.out.println("Set main thread name and priority \n");
        thrd.setName("thrd1");
        thrd.setPriority(thrd.NORM_PRIORITY + 3);
        System.out.println("Thread main name:" + thrd.getName());
        System.out.println("Thread Priority:" + thrd.getPriority());
    }
}
