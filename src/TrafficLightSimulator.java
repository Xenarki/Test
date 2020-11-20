class TrafficLightSimulator implements Runnable{
    private TrafficLightColor tlc;
    boolean stop = false;
    boolean changed = false;

    TrafficLightSimulator(TrafficLightColor init){
        tlc = init;
    }
    TrafficLightSimulator(){
        tlc = TrafficLightColor.RED;
    }
    public void run(){
        while (!stop){
            try{
                switch (tlc){
                    case GREEN:
                        Thread.sleep(10000);
                        break;
                    case YELLOW:
                        Thread.sleep(20000);
                        break;
                    case RED:
                        Thread.sleep(120000);
                        break;
                }
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
        }
        changeColor();
    }

    synchronized void changeColor(){
        switch (tlc){
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
                break;
        }
        changed = true;
        notify();
    }
    synchronized void waitForChange(){
        try{
            while (!changed)
                wait();
            changed = false;
        }catch (InterruptedException exc){
            System.out.println(exc);
        }
    }
    synchronized TrafficLightColor getColor(){
        return  tlc;
    }
    synchronized void cancel(){
        stop = true;
    }

}
