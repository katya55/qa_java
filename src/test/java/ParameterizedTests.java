import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedTests {

    @Mock
    Feline felineMock = Mockito.mock(Feline.class);

    @ParameterizedTest
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    public void doesHaveManeReturnTrueOrFalse(String sex, Boolean expected) throws Exception {
        Lion lion = new Lion(sex, felineMock);
        assertEquals(expected, lion.doesHaveMane());
    }
}

