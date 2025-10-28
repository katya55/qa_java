import com.example.Animal;
import com.example.Feline;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
class FelineTest {

    Animal animal = Mockito.mock(Animal.class);

    @Test
    public void eatMeatWhenPredator() throws Exception {
        Feline feline = new Feline();
        feline.eatMeat();
        Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные, Птицы, Рыба"));

    }

    @Test
    public void eatMeatWhenHerbivores() throws Exception {
        Feline feline = new Feline();
        feline.eatMeat();
        Mockito.when(animal.getFood("Травоядное")).thenReturn(List.of("Трава", "Различные растения"));
    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        String result = feline.getFamily();
        assertEquals("Кошачьи", result);

    }

}