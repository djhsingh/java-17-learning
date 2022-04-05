import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateAPI {
    public static void main(String [] args){
        System.out.println("Hello Date API..");
        System.out.println(new Date());
        System.out.println(new Date().getTime());
        System.out.println("-------------------------");
        Instant instant = Instant.now();
        System.out.println(instant);
        Duration duration = Duration.ofSeconds(100);
        System.out.println(duration);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH-mm-ss");
        System.out.println(dtf.format(dateTime));
    }
}
