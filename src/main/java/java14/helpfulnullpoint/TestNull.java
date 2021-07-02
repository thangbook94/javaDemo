package java14.helpfulnullpoint;

public class TestNull {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getParent().getParent());
    }
}
