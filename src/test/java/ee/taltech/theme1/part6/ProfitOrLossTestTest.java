package ee.taltech.theme1.part6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProfitOrLossTestTest {

    @Test
    void testProfitOrLossDecision() {
        assertEquals("PROFIT", ProfitOrLoss.decide(2, 1));
        assertEquals("BREAK EVEN", ProfitOrLoss.decide(2, 2));
        assertEquals("LOSS", ProfitOrLoss.decide(1, 2));
    }
}