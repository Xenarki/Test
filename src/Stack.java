public class Stack {
    private int tos;
    private char stck[];

    Stack(int size) {
        stck = new char[size];
        tos = 0;
    }

    Stack(Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];
        for (int i; i < tos; i++) {
            stck[i] = ob.stck[i];
        }
    }

    Stack(char a[]) {
        tos = a.length;
        stck = new char[a.length];
        for (int i = 0; i < tos; i++) {
            stck[i] = a[i];
        }
    }
    void push(char ch){
        if(tos == stck.length){
            System.out.println("Стек переполнен!");
            return;
        }
        stck[tos] = ch;
        tos++;
    }

    char pop(){
        if(tos == 0){
            System.out.println("Стек кончился!");
            return;
        }
        tos--;
        return stck[tos];
    }
}