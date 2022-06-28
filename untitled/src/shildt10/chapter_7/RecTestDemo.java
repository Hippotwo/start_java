package shildt10.chapter_7;

public class RecTestDemo {
    public static void main(String[] args) {
        RecTest rt = new RecTest(7);

        for (int i = 0; i < 7; i++) rt.values[i] = i*2;
        rt.printArray(7);

    }
}
