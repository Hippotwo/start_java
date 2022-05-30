package shildt10.chapter_3;

/**
 Правило продвижения. Если один из операндов, относится к более вместительному типу операнда, то все выражение
 будет "продвигатся" к нему
 */
public class Promote {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f  = 5.67f;
        double d = .1234;

        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("Result  (f * b) + (i / c) - (d * s) " + result);
    }
}
