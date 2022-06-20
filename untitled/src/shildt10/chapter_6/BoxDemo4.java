package shildt10.chapter_6;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;
        mybox1.height = 11;
        mybox1.width = 13;
        mybox1.depth = 14;

        mybox2.height = 10;
        mybox2.width = 10;
        mybox2.depth = 10;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 = " + vol);

        vol = mybox2.volume();
        System.out.println("Volume of mybox1 = " + vol);
    }
}
