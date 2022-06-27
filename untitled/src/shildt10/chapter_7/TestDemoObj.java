package shildt10.chapter_7;

public class TestDemoObj {
    public static void main(String[] args) {
        Test ob = new Test(11, 22);

        System.out.println(ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println(ob.a + " " + ob.b);
    }
}
