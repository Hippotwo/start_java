package shildt10.chapter_5;

public class ClassBreakAlmostGoTO {
    public static void main(String[] args) {
        boolean t = true;

        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Presenting break");
                    if (t) break second;
                    System.out.println("This line wont execute");
                }
                System.out.println("This line wont execute");

            }
            System.out.println("This part after SECOND");
        }
    }
}
