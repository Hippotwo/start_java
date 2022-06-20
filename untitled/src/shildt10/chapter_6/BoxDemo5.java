package shildt10.chapter_6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        mybox1.setDim(10,11,12);
        vol  = mybox1.volume();

        System.out.println("Volume of mybox1 = " + vol);

        mybox2.setDim(1,2,3);
        vol = mybox2.volume();

        System.out.println("Volume of mybox2 = " + vol);
    }
}
