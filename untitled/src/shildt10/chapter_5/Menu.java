package shildt10.chapter_5;

public class Menu {

    public static void main(String[] args)
            throws java.io.IOException {
        char choice;
        do {
            System.out.println("Help");
            System.out.println("    1. If");
            System.out.println("    2. Switch");
            System.out.println("    3. While");
            System.out.println("    4. Do-while");
            System.out.println("    5. Fro\n");
            System.out.println("Choice your destiny:");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');
        System.out.println("\n");
        switch (choice) {
            case '1':
                System.out.println("if:\n");
                System.out.println("if(bool_exp) operator");
                System.out.println("else operator;");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("case const:");
                System.out.println("some operators");
                System.out.println("break;");
                System.out.println("//...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("while:\n");
                System.out.println("while(bool_exp) operator;");
                break;
            case '4':
                System.out.println("do while:\n");
                System.out.println("do {");
                System.out.println("operator;");
                System.out.println("} while (expression); ");
                break;
            case '5':
                System.out.println("for:\n");
                System.out.println("for(initialization; expression; iteration)");
                System.out.println("operator; 1");
                break;
            default:
                System.out.println("! Wrong choice! ");
        }


    }
}

