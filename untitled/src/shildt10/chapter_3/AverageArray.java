package shildt10.chapter_3;

public class AverageArray {
    public static void main(String[] args) {
        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double res = 0;

        for (int i = 0; i < nums.length; i++) {
            res = res + nums[i];
        }
        System.out.println("Average value is " + res / 5);

    }
}
