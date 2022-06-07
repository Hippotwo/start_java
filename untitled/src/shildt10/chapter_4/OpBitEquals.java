package shildt10.chapter_4;

public class OpBitEquals {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        /** 0000, 0001, 0010, 0011, 0100,
         * */
        a |= 4;
        b >>= 1;
        c <<= 1;
        a ^= c;


        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
