package ee.taltech.theme2.part6;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NegativesTest {

    //todo 16.2
    // we could have 5 tests: null, empty, only negatives, only positives, mixed
    // we should assert status, input and output, duration is for information purposes and is hard to assert

    @Test
    @DisplayName("Remove Positives Returns Null On Null")
    void removePositivesReturnsNullOnNull(){
        CalculationResult result = Negatives.removePositives(null);
        assertNull(result.getInput());
        assertNull(result.getOutput());
        assertNotNull(result.getDuration());
        assertEquals(CalculationStatus.NO_CALC, result.getStatus());
    }

    @Test
    @DisplayName("Remove Positives Returns Empty On Empty")
    void removePositivesReturnsEmptyOnEmpty(){
        CalculationResult result = Negatives.removePositives(List.of());
        assertEquals(List.of(), result.getInput());
        assertEquals(List.of(), result.getOutput());
        assertNotNull(result.getDuration());
        assertEquals(CalculationStatus.OK, result.getStatus());
    }

    @Test
    @DisplayName("Remove Positives Doens't Remove Negatives")
    void removePositivesDoesntRemoveNegatives(){
        List<Integer> list = List.of(-1, -2, -3);
        CalculationResult result = Negatives.removePositives(list);
        assertEquals(list, result.getInput());
        assertEquals(list, result.getOutput());
        assertNotNull(result.getDuration());
        assertEquals(CalculationStatus.OK, result.getStatus());
    }

    @Test
    @DisplayName("Remove Positives Removes Positives")
    void removePositivesRemovesRemovesPositives(){
        CalculationResult result = Negatives.removePositives(List.of(1, 13, 999));
        assertEquals(List.of(1, 13, 999), result.getInput());
        assertEquals(List.of(), result.getOutput());
        assertNotNull(result.getDuration());
        assertEquals(CalculationStatus.OK, result.getStatus());
    }

    @Test
    @DisplayName("Remove Positives But Keeps Negatives")
    void removePositivesButKeepsNegatives(){
        CalculationResult result = Negatives.removePositives(List.of(1, 13, -2, -4, 999));
        assertEquals(List.of(1, 13, -2, -4, 999), result.getInput());
        assertEquals(List.of(-2, -4), result.getOutput());
        assertNotNull(result.getDuration());
        assertEquals(CalculationStatus.OK, result.getStatus());
    }
}
