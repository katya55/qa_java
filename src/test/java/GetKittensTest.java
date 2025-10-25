import com.example.Feline;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class GetKittensTest {

    @Spy
    private Feline feline;

    @Test
    public void getKittens() {
        feline.getKittens();
        Mockito.verify(feline).getKittens(Mockito.eq(1));
        assertEquals(1, feline.getKittens());

    }

    @Test
    public void getFamily() {
        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
        feline.getFamily();
        Mockito.verify(feline).getFamily();
    }
}