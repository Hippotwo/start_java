package shildt10.chapter_7;

public class TetsReturnObj {
    int a;

    TetsReturnObj(int a) {
        this.a = a;

    }

    TetsReturnObj increaceByTen() {
        TetsReturnObj temp = new TetsReturnObj(this.a + 10);
        return temp;
    }


}
