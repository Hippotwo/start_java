package shildt10.chapter_6;

public class BoxDemo2 {
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

        vol = mybox1.depth * mybox1.width * mybox1.height;
        System.out.println("Volume of mybox1 is " + vol);

        vol = mybox2.depth * mybox2.width * mybox2.height;
        System.out.println("Volume of mybox2 is " + vol);
    }
}
