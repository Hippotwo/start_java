package shildt10.chapter_5;

public class ForVsForEach {
    public static void main(String[] args) {
        int nums[] = new int[10];

       int summ = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        System.out.println("Array is FULL");

        for (int i = 0; i < nums.length; i++) {
            summ += nums[i];
        }
        System.out.println("summ = " + summ);
        summ = 0;

        for (int a:nums) {
            summ += a;
        }
        System.out.println("summ = " + summ);
    }
}
