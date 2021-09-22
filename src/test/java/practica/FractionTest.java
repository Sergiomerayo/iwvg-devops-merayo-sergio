package practica;

import es.upm.miw.iwvg_devops.practica.Fraction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {

    Fraction fraction;

    @BeforeEach
    void before() {
        this.fraction = new Fraction(1,2);
    }

    @Test
    void testFraction() {
        Fraction fraction2 = new Fraction(1, 1);
        assertEquals(fraction2.toString(), new Fraction().toString());
    }
    @Test
    void testGetNumerator() {
        assertEquals(1, this.fraction.getNumerator());
    }

    @Test
    void testSetNumerator() {
        this.fraction.setNumerator(2);
        assertEquals(2, this.fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        assertEquals(2, this.fraction.getDenominator());
    }

    @Test
    void testSetDenominator() {
        fraction.setDenominator(3);
        assertEquals(3, this.fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(0.5, this.fraction.decimal());
    }

    @Test
    void testToString() {
        assertEquals("Fraction{numerator=1, denominator=2}", this.fraction.toString());
    }
}
