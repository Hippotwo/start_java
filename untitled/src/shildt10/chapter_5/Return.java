package shildt10.chapter_5;

public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("Before return");

        if (t) return;
        System.out.println("This line won't be displayed");
    }
}
