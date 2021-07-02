package java11.streams.reactive;


import java.util.List;
import java.util.concurrent.SubmissionPublisher;

public class TestReactive {
    public static void main(String[] args) throws InterruptedException {
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        EndSubscriber<String> subscriber = new EndSubscriber<>(5);
        publisher.subscribe(subscriber);
        List<String> items = List.of("1", "x", "2", "x", "3", "x");

        // when
        System.out.println("Number " + publisher.getNumberOfSubscribers());
        items.forEach(publisher::submit);
        for (String s : subscriber.consumedElements) {
            System.out.println(s);
        }
        publisher.close();

    }
}
