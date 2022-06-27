package shildt10.chapter_7;

public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalsTo(Test o) {
        if (o.a == a && o.b == b)
            return true;
        else return false;

    }

    void meth(Test o) {
        o.a /= 2;
        o.b *= 2;
    }
}
