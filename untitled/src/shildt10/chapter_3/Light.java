package shildt10.chapter_3;

public class Light {
    public static void main(String[] args) {
        int lightspeed = 18600;
        long days = 1000;
        long seconds;
        long distance;

        seconds = 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.println("In " + days + " \ndays the light is overcome\n" + distance + " miles.");

    }

}
