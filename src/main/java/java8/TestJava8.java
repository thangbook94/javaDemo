package java8;

import java.util.List;

public class TestJava8 {
    public static void main(String[] args) {
        final var listPerson = List.of(new AnotherPerson(7.51, 12, "F"),
                new AnotherPerson(6.1, 17, "F"), new AnotherPerson(3.1, 20, "F"));
        boolean ok = false;
        for (final var person : listPerson) {
            if (person.getGender().equals("M")) {
                ok = true;
                break;
            }
        }
        if (!ok) {
            var sumAge = 0.0;
            var cnt = 0;
            for (var person : listPerson) {
                if (Double.compare(person.getScore(), 3.0) == 1) {
                    sumAge += person.getAge();
                    cnt++;
                }
            }
            System.out.println(sumAge / cnt);
        }
    }
}
