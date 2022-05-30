package shildt10.chapter_3;

public class Conversion{
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("Cenversion int to byte");
        b = (byte)i;
        System.out.println("i and b " + i +" " + b);

        i = (int)d;
        System.out.println("Conversion doublt to int " + d + " " + i );

        b = (byte)d;
        System.out.println("Conversion double to byte " + d + " " + b);
    }
}
