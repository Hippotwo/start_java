package shildt10.chapter_6;

public class TestStack {
    public static void main(String[] args) {

        Stack stck1 = new Stack();
        Stack stck2 = new Stack();

        for (int i = 0; i < 10; i++) {
            stck1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            stck2.push(i);
        }

        System.out.println("Stack stck1 contains");
        for (int i = 0; i < 10; i++) {
            System.out.println(stck1.pop());
        }

        System.out.println("Stack stck2 contains");
        for (int i = 0; i < 10; i++) {
            System.out.println(stck2.pop());
        }

    }
}
