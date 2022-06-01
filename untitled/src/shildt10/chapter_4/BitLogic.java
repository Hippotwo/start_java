package shildt10.chapter_4;

public class BitLogic {
    public static void main(String[] args) {
        String binary[] = {"0000", // 0
                "0001", // 1
                "0010", // 2
                "0011", // 3
                "0100", // 4
                "0101", // 5
                "0110", // 6
                "0111", // 7
                "1000", // 8
                "1001", // 9
                "1010", // 10
                "1011", // 11
                "1100", // 12
                "1101", // 13
                "1110", // 14
                "1111"}; // 15


        int a = 3, b = 6;

        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;

        System.out.println(" a = " + binary[a]);
        System.out.println(" b = " + binary[b]);
        System.out.println(" a | b = " + binary[c]);
        System.out.println(" a & b = " + binary[d]);
        System.out.println(" a ^ b = " + binary[e]);
        System.out.println(" (~a & b) | (a & ~b) = " + binary[f]);
        System.out.println(" ~a = " + binary[g]);

    }
}
