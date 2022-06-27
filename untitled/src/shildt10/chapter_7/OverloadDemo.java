package shildt10.chapter_7;

public class OverloadDemo {
    void test(){
        System.out.println("Have no parameters");
    }

//    void test (int a){
//        System.out.println("One parameter 'a' = "  + a);
//    }

    void test(int a, int b){
        System.out.println("Two parameter 'a' and 'b' " + " a "+ a + " b " + b);
    }

    double test(double a){
//        System.out.println("Double 'a' "+ a);
        return a * a;
    }




}
