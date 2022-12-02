import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    Calculator calkul = new Calculator();

    @Test
    void sloj(){
        assertEquals(5,calkul.addition(2,3));
    }
    @Test
    void subt(){
        assertEquals(6, calkul.sub(9,3));
    }
    @Test
    void umnoj(){
        assertEquals(42, calkul.mult(6,7));
    }
    @Test
    void delen(){
        assertEquals(9, calkul.divide(27, 3));
    }
}
