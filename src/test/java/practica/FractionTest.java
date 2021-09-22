package practica;

import es.upm.miw.iwvg_devops.practica.Fraction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void testIsProper(){
        assertTrue(this.fraction.isProper());
        assertFalse(new Fraction().isProper());
    }

    @Test
    void testIsImproper(){
        assertFalse(this.fraction.isImproper());
        assertTrue(new Fraction().isImproper());
    }

    @Test
    void testIsEquivalent(){
      Fraction fraction = new Fraction(2, 4);
        assertTrue(this.fraction.isEquivalent(fraction));
    }

    @Test
    void testAdd() {
        Fraction fraction = new Fraction(1, 2);
        assertEquals(1, this.fraction.add(fraction).decimal());
    }

    @Test
    void testMultiply(){
        Fraction fraction = new Fraction(1, 2);
        assertEquals(0.25, this.fraction.multiply(fraction).decimal());
    }

    @Test
    void testDivide(){
        Fraction fraction = new Fraction(3, 2);
        assertEquals(3, fraction.divide(this.fraction).decimal());
    }
}
