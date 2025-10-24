import com.example.Feline;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;


@ExtendWith(MockitoExtension.class)
class FelineTest {

    Feline felineMock = Mockito.mock(Feline.class);

    @Test
    public void eatMeatWhenPredator() throws Exception {
        Feline feline = new Feline();
        feline.eatMeat();
        Mockito.when(felineMock.getFood("Хищник")).thenReturn(List.of("Животные, Птицы, Рыба"));

    }

    @Test
    public void eatMeatWhenHerbivores() throws Exception {
        Feline feline = new Feline();
        feline.eatMeat();
        Mockito.when(felineMock.getFood("Травоядное")).thenReturn(List.of("Трава", "Различные растения"));
    }
}