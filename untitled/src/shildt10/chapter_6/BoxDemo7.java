package shildt10.chapter_6;

public class BoxDemo7 {
    public static void main(String[] args) {

        Box mybox1 = new Box(11,12,13);
        Box mybox2 = new Box(4,5,6);

        double vol;

        vol = mybox1.volume();
        System.out.println(vol);

        vol = mybox2.volume();
        System.out.println(vol);
    }
}
