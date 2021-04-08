import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Gigasecond {

    private final long GIGA_SECOND = 1_000_000_000;
    private LocalDateTime momentAfterGigaSecond;

    public Gigasecond(LocalDate moment) {
        this(moment.atTime(LocalTime.MIDNIGHT));
    }

    public Gigasecond(LocalDateTime moment) {
        this.momentAfterGigaSecond = moment.plus(GIGA_SECOND, ChronoUnit.SECONDS);
    }

    public LocalDateTime getDateTime() {
        return momentAfterGigaSecond;
    }
}
