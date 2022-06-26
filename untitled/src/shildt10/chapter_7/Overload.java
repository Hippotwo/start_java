package shildt10.chapter_7;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ovrld = new OverloadDemo();
        double result;

        ovrld.test();
        ovrld.test(1);
        ovrld.test(2);
        ovrld.test(1, 3);
        System.out.println(ovrld.test(2.0));
        result = ovrld.test(3.0);
        System.out.println(result);

    }
}
