package shildt10.chapter_3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b = " + b);
        b = true;
        System.out.println("b = " + b);

        if(b) System.out.println("Code is processing");
        b = false;
        if(b) System.out.println("Code is NOT processing");

        System.out.println("Result of 10 > 9 " + (10 > 9));

    }
}
