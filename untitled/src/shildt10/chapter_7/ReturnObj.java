package shildt10.chapter_7;

public class ReturnObj {
    public static void main(String[] args) {

        TetsReturnObj ob1 = new TetsReturnObj(2);
        TetsReturnObj ob2;

        ob2 = ob1.increaceByTen();

        System.out.println("ob1.a = " + ob1.a);
        System.out.println("ob2.a = " + ob2.a);

        ob2 = ob2.increaceByTen();

        System.out.println("After increace");
        System.out.println("ob1.a = " + ob1.a);
        System.out.println("ob2.a = " + ob2.a);





    }
}
