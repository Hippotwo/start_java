package shildt10.chapter_5;

public class ForEachBreak {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9,0};
        int sum = 0;

        for (int a:arr) {
            sum += a;
            if (a == 5) break;
        }
        System.out.println(" sum first 5 elements is " + sum);

    }
}
