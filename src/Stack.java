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
        for (int i = 0; i < tos; i++) {
            stck[i] = ob.stck[i];
        }
    }

    Stack(char a[]) {
        stck = new char[a.length];
        for (int i = 0; i < stck.length; i++) {
            push(a[i]);
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
            return 0;
        }
        tos--;
        return stck[tos];
    }
}