package shildt10.chapter_5;

public class BreakLoopWhile {
    public static void main(String[] args) {
        int val = 10;
        int i = 0;

        while(i < 100){
            System.out.println(" i = " + i);
            if (i == val) break;
            i++;
        }
        System.out.println("End of loop");
    }
}
