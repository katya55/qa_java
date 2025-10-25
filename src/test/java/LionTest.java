import static org.junit.jupiter.api.Assertions.*;

import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class LionTest {

    @Mock
    Feline felineMock = Mockito.mock(Feline.class);

    Lion lion;

   @BeforeEach
    void setUp() throws Exception {
        lion = new Lion(felineMock);
    }

    @Test
    public void getKittensReturnValues() throws Exception {
        Mockito.when(felineMock.getKittens()).thenReturn(1);
        lion.getKittens();
        Mockito.verify(felineMock).getKittens();
    }

    @Test
    public void getFood() throws Exception {
        Mockito.when(felineMock.getFood("Хищник")).thenReturn(List.of("Животные, Птицы, Рыба"));
        lion.getFood();
        Mockito.verify(felineMock).getFood(Mockito.any());
    }

    @Test
    public void LionReturnException() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> new Lion("Бесполый"));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}