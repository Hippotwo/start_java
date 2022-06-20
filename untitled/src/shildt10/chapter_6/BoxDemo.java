package shildt10.chapter_6;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        mybox.depth = 100;
        mybox.width = 10;
        mybox.height = 11.45;

        vol = mybox.height * mybox.width * mybox.depth;
        System.out.println("Volume of box = " + vol);
    }
}
