import com.example.Lion;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedTests {

    @ParameterizedTest
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    public void doesHaveManeReturnTrueOrFalse(String sex, Boolean expected) throws Exception {
        Lion lion = new Lion(sex);
        assertEquals(expected, lion.hasMane);
    }

