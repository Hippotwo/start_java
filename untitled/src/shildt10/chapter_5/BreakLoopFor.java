package shildt10.chapter_5;

public class BreakLoopFor {
    public static void main(String[] args) {
        int val = 10;

        for (int i = 0; i < 100; i++) {
            if (i == val) break;
            System.out.println(" i = " + i);
        }
        System.out.println("Loop is complete");
    }
}
