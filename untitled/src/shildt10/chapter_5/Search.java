package shildt10.chapter_5;

public class Search {
    public static void main(String[] args) {
        int num [] = {1,2,3,5,67,8,1,2,6,47};
        boolean found  = false;
        int val = 68;

        for (int a:num) {
            if (a == val) {
                found = true;
                break;
            }
        }
        if(found) System.out.println("The number " + val + " presented in array num");
        else System.out.println("The number " + val + " NOT presented in array num");
    }
}
