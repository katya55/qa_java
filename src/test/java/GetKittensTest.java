import com.example.Feline;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class GetKittensTest {

    @Spy
    private Feline feline;

    @Test
    public void getKittens() {
        feline.getKittens();
        Mockito.verify(feline).getKittens(Mockito.eq(1));
    }

}