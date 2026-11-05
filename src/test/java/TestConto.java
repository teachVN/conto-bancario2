
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.epicode.Conto;

public class TestConto {
    
    @Test 
    public void testDepositaValorePositivo() {
        Conto conto = new Conto("123456789", 1000.0, "Mario Rossi");
        conto.deposita(200.0);
        assertEquals(1200, conto.getSaldo());
    }

    @Test
    public void testDepositaValoreNegativo() {
        Conto conto = new Conto("123456789", 1000.0, "Mario Rossi");
        conto.deposita(-50.0);
        assertEquals(1000, conto.getSaldo());
}
}
