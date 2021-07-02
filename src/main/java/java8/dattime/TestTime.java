package java8.dattime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class TestTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate date1 = LocalDate.of(2016, 02, 29);
        System.out.println(date1);
        System.out.println(date.plusDays(1));
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println(zoneId);
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(String.join(" ", allZoneIds));
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(localDateTime + " " + zonedDateTime);
    }
}
