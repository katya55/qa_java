import com.example.Animal;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest {

    private static Stream<Arguments> foods() {
        return Stream.of(
                Arguments.of("Травоядное", List.of("Трава", "Различные растения")),
                Arguments.of("Хищник", List.of("Животные", "Птицы", "Рыба"))
        );
    }

    @ParameterizedTest
    @MethodSource("foods")
    public void getFood(String animalKind, List < String > expected) throws Exception {
        Animal animal = new Animal();
        assertEquals(expected, animal.getFood(animalKind));
    }

    @Test
    public void getFood() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Хищник");
    }
}