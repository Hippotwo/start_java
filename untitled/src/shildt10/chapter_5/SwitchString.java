package shildt10.chapter_5;

public class SwitchString {
    public static void main(String[] args) {
        String number = "";
        String n = "Four";

        switch (n) {
            case "One":
                number = "One";
                break;
            case "Two":
                number = "Two";
                break;
            case "four":
                number = "four";
                break;
            default:
                System.out.println("by default");
        }
        System.out.println(number);
    }
}
