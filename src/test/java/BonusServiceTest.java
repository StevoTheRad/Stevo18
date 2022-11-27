import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.javaqamvn.services.BonusService;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void testRegisteredUnderLimit(int expected, int amount, boolean isRegistered) {
        BonusService service = new BonusService();

        int actual = service.calcBonus(amount, isRegistered);

        Assertions.assertEquals(expected, actual);
    }
}
