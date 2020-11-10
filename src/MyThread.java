public class MyThread  extends Thread {
    MyThread(String name){
        super(name);
    }
    public void run(){
        System.out.println(getName() + " - запуск.");
        try {
            for(int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("B" + getName() + " count " + count);
            }
        }
        catch (InterruptedException exc){
            System.out.println(getName() + " dis" + exc.getMessage());
        }
        System.out.println(getName() + " - complite");
    }
}

