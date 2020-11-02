public class IQDemo {
    class FixedQueue implements ICharQ{
        private char q[];
        private int putloc, getloc;

        public FixedQueue(int size){
            q = new char[size];
            putloc = getloc = 0;
        }
        public void put(char ch){
            if(putloc == q.length){
                System.out.println("очередь заполнена");
                return;
            }
            q[getloc++] = ch;
        }
        public char get(){
            if(getloc == putloc){
                System.out.println("очередь пуста");
                return (char) 0;
            }
            return q[getloc++]
        }
    }

    class CircularQueue implements ICharQ{
        private char q[];
        private int putloc, getloc;

        public CircularQueue(int size){
            q = new char[size];
            putloc = getloc = 0;

            public void put(char ch){
                if(putloc == q.length){
                    System.out.println("очередь заполнена");
                    return;
                }
                q[getloc++] = ch;
            }
        }
    }
}
