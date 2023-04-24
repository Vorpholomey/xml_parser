import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

// Генерируем дату и время
public class RandomDate {

    public static String genDate() {
        DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyyMMdd");

        return LocalDate.now().minus(Period.ofDays((new Random().nextInt(365 * 20)))).format(dateTime);

    }

    public static String genDateTime() {
        Date outputTime = new Date();
        DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyyMMdd");
        String outputDate = LocalDate.now().minus(Period.ofDays((new Random().nextInt(365 * 20)))).format(dateTime);

        // String outputTime = Integer.toString(random.nextInt(12))+Integer.toString(random.nextInt(60));
        return outputDate + outputTime.getHours() + outputTime.getMinutes() + "+0300";
    }

    public static String createDate() {
        DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyyMMdd");
        return LocalDate.now().format(dateTime);
    }
    public static String createDateTime(){
        DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyyMMdd");
        Date outputTime = new Date();
        String outputDate = LocalDate.now().format(dateTime);
        return outputDate + outputTime.getHours() + outputTime.getMinutes() + "+0300";
    }

}
