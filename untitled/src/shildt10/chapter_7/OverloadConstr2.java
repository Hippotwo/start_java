package shildt10.chapter_7;

public class OverloadConstr2 {
    public static void main(String[] args) {

        Box mybox1 = new Box();
        Box mybox2 = new Box(1,23,4);
        Box mybox3 = new Box(7);

        Box myboxClone = new Box(mybox1);

        System.out.println(mybox1.volume());
        System.out.println(mybox2.volume());
        System.out.println(mybox3.volume());
        System.out.println(myboxClone.volume());
    }
}
