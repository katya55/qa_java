import com.example.Cat;
import com.example.Feline;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class CatTest {

    @Mock
    Feline felineMock = Mockito.mock(Feline.class);;

    @Test
    public void getFoodIsCallAndReturnValues() throws Exception {
        Cat cat = new Cat(felineMock);
        cat.getFood();
        //Mockito.when(felineMock.getFood()).thenReturn(List.of("Животные, Птицы, Рыба"));
        Mockito.verify(felineMock).eatMeat();
    }

    @Test
    public void getSound() {
        Cat cat = new Cat(felineMock);
        String result =  cat.getSound();
        assertEquals("Мяу", result);

    }

}