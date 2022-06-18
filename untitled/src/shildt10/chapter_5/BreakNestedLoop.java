package shildt10.chapter_5;

public class BreakNestedLoop {
    public static void main(String[] args) {
        outer: {
            for (int i = 0; i < 3; i++) {
                System.out.println("Cycle " + i);
                for (int j = 0; j < 100; j++) {
                    if (j == 10) break outer;
                    System.out.print(" " + j);
                }
                System.out.println("This line won't display");
            }
        }
        System.out.println(" Both loop is finished");
    }
}
