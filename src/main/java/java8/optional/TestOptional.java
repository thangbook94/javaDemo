package java8.optional;

import java.util.Optional;

public class TestOptional {


    public static void main(String[] args) {
        String name = "thangnd";
        Optional<String> opt = Optional.of(name);
        System.out.println(opt.isPresent());

        String name1 = null;
        System.out.println(Optional.ofNullable(name1).isPresent());
        //Optional.of(name1);

//before java 8
        if (name != null) {
            System.out.println(name.length());
        }

//in java 8
        opt = Optional.of("thangnd");
        opt.ifPresent(name2 -> System.out.println(name2.length()));

//orElse

    }

    public void getDefault() {
        String nullName = null;
        String name3 = Optional.ofNullable(nullName).orElse("abc");
        String name4 = Optional.ofNullable(nullName).orElseGet(this::getMyDefault);
    }

    public String getMyDefault() {
        System.out.println("Getting Default Value");
        return "Default Value";
    }
}
