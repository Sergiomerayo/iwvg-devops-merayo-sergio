package practica;

import es.upm.miw.iwvg_devops.practica.Fraction;
import es.upm.miw.iwvg_devops.practica.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    List<Fraction> fractions;
    private User user;

    @BeforeEach
    void before() {
        fractions = List.of(
                new Fraction(),
                new Fraction(),
                new Fraction()
        );
        user = new User("1", "Sergio", "Merayo", fractions);
    }

    @Test
    void testGetId() {
        assertEquals("1", user.getId());
    }

    @Test
    void testGetName() {
        assertEquals("Sergio", user.getName());
    }

    @Test
    void testSetName() {
        user.setName("SergioTest");
        assertEquals("SergioTest", user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Merayo", user.getFamilyName());
    }

    @Test
    void testSetFamilyName() {
        user.setFamilyName("MerayoTest");
        assertEquals("MerayoTest", user.getFamilyName());
    }

    @Test
    void testGetFractions() {
        assertEquals(fractions, user.getFractions());
    }

    @Test
    void testSetFractions() {
        List<Fraction> fractions2 = List.of(
                new Fraction(),
                new Fraction(),
                new Fraction(),
                new Fraction(),
                new Fraction()
        );
        user.setFractions(fractions2);
        assertEquals(fractions2, user.getFractions());
    }

    @Test
    void testAddFraction() {
        List<Fraction> fractions2 = List.of(
                new Fraction(),
                new Fraction(),
                new Fraction(),
                new Fraction()
        );
        user.addFraction(new Fraction());
        assertEquals(4, user.getFractions().size());
    }

    @Test
    void testFullName() {
        assertEquals("Sergio Merayo", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("S.", user.initials());
    }

    @Test
    void testToString() {
        assertEquals("User{id='1', name='Sergio', familyName='Merayo', fractions=" + fractions + '}', user.toString());
    }

}
