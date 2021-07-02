package java14.switchnew;

import java14.switchnew.TestSwitchNew.Level;

public class TestSwitchOld {
    public static void main(String[] args) {
        Level myLev = Level.MEDIUM;
        var result = -1;
        switch (myLev) {
            case LOW:
                result = 0;
                break;
            case MEDIUM:
                result = 1;
                break;
        }
        System.out.println(result);
    }
}
