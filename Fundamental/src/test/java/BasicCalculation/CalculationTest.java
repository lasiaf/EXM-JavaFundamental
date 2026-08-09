package BasicCalculation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationTest {

        @Test
        void testHitungGajiBersih() {
            Calculation calc = new Calculation();
            float hasil = calc.hitungGajiBersih(250000);
            assertEquals(220000, hasil);
        }

}
