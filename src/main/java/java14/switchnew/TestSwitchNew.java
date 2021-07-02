package java14.switchnew;

public class TestSwitchNew {
    public static void main(String[] args) {
        Level myLev = Level.MEDIUM;
        var result = switch (myLev) {
            case LOW -> 0;
            case MEDIUM, HIGH -> 1;
        };
        System.out.println(result);
    }

    enum Level {
        LOW, MEDIUM, HIGH
    }
}
