package ee.taltech.theme3.part3;

import ee.taltech.theme2.part2.SumOfElements;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class Negatives2Test {

    @Test
    void on_null_nothing_is_returned() {
        assertNull(Negatives2.biggestNegative(null));
    }

    @Test
    void on_no_elements_nothing_is_returned() {
        assertNull(Negatives2.biggestNegative(new ArrayList<>()));
    }

    @Test
    void biggest_negative_is_not_inside_a_positive_list() {
        assertNull(Negatives2.biggestNegative(List.of(1, 3, 2, 0)));
    }

    @Test
    void biggest_element_returns_biggest_negative_element_of_the_list() {
        Integer biggestNegative = Negatives2.biggestNegative(List.of(-3, -200, 0));
        assertNotNull(biggestNegative);
        assertEquals(-3, (int) biggestNegative);
    }

    //todo 103.3 sumOfNegatives I think we should create null, empty list, negatives list, positives list, mixed list

    @Test
    void on_null() {
        assertEquals(Optional.empty(), Negatives2.sumOfNegatives(List.of()));
    }

    @Test
    void on_positives() {
        assertEquals(Optional.empty(), Negatives2.sumOfNegatives(List.of(1, 2, 3)));
    }

    @Test
    void on_negatives() {
        Optional<Integer> actual = Negatives2.sumOfNegatives(List.of(-1, -2, -3));
        assertEquals(-6, actual.get());
    }
    @Test
    void on_mixed() {
        Optional<Integer> actual = Negatives2.sumOfNegatives(List.of(-1, 2, -3));
        assertEquals(-4, actual.get());
    }


    @Test
    void on_no_elements() {
        assertEquals(Optional.empty(), Negatives2.sumOfNegatives(List.of()));
        assertThrows(IllegalArgumentException.class, ()->SumOfElements.sum(List.of()));
        //todo 12.4 this is your decision what to return on "empty list" input
    }
}
