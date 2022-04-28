package ch.fhnw.oop2.addex.collections.aufgabe5.solution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Test;

public class TestLottoApp {

    @Test
    public void testGrow() {
        // given
        LottoApp app = new LottoApp();

        // when
        Set<Integer> result = app.lotto();
        
        // then
        assertEquals(6, result.size()); // sechs Zahlen
        assertTrue(result.stream().min(Integer::compareTo).orElse(-1) >= 1); // zwischen 1
        assertTrue(result.stream().max(Integer::compareTo).orElse(50) <= 49); // und 49 (inklusive)
        // Set garantiert, dass jede Zahl nur einmal vorkommt.
        
    }
}



