package shildt10.chapter_7;

public class TestValueDemo {
    public static void main(String[] args) {
        TestValue tv = new TestValue();

        int a = 20;
        int b = 15;

        System.out.println("Before method call a= " + a + " b= " +b);

        tv.meth(a, b);
        System.out.println("After method call a= " + a + " b= " +b);


    }
}
