package shildt10.chapter_5;

public class SwithMonth {
    public static void main(String[] args) {
        String season = "";
        int i = 4;
            switch(i){
                case 12:
                case 1:
                case 2:
                    season = "Winter";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "Spring";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "Summer";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "Autumn";
                    break;
                default:
                    System.out.println("Hey man, u kidding again?");
            }
            System.out.println("The 4 month is " + season);
        }
    }

