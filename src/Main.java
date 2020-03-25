public class Main {

    static final int TURTLES_STEPS = 1,  ACHILLES_STEPS = TURTLES_STEPS * 10;
    static int achilles_distance = 0, turtles_distance = 1000;
    static int loop_number = 0;

    public static void main(String[] args) {
        System.out.println("First Turtles distance: " + turtles_distance + "\nFirst Axiles distance: " + achilles_distance);

        while (achilles_distance < turtles_distance) {
            loop_number++;
            System.out.println("Turtles distance: " + turtles_distance + "\nAxiles distance: " + achilles_distance);
            turtles_distance = turtles_distance + TURTLES_STEPS;
            achilles_distance = achilles_distance + ACHILLES_STEPS;
        }

        System.out.println("Last one Turtles distance: " + turtles_distance +
                            "\nLast one Axiles distance: " + achilles_distance +
                            "\nloop counter: " + loop_number);
    }
}
