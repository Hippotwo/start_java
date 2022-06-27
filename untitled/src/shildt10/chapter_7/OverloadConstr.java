package shildt10.chapter_7;

public class OverloadConstr {
    public static void main(String[] args) {

        Box myBox1 = new Box();
        Box myBox2 = new Box(1);
        Box myBox3 = new Box(1,2,3);

        System.out.println(myBox1.volume());
        System.out.println(myBox2.volume());
        System.out.println(myBox3.volume());
    }
}
