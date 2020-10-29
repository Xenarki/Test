public class Overload {
    void ovlDemo(){
        System.out.println("Без параметров");
    }
    void ovlDemo(int a){
        System.out.println("Один параметр: " + a);
    }
    void ovlDemo(int a,int b){
        System.out.println("Два параметра: " + a + " " + b);
    }
}
