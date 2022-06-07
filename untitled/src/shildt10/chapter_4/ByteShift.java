package shildt10.chapter_4;

public class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;

        i = a << 2;

        b = (byte) (a << 2);
        System.out.println("Initial value for a = " + a + " and second value for a = " + i );
        System.out.println("b have value = " + b );
    }
}
