package shildt10.chapter_7;

public class DemoTest {
    public static void main(String[] args) {

        Test t1 = new Test(100, 2);
        Test t2 = new Test(100, 2);
        Test t3 = new Test(1001, 2);
        Testd td = new Testd(100, 2);

        System.out.println("t1 == t2 " + t1.equalsTo(t2));
        System.out.println("t2 == t3 " + t2.equalsTo(t3));
//        System.out.println("td == t1 " + t1.equalsTo(td)); // wrong!
    }
}
