package practica;

import es.upm.miw.iwvg_devops.practica.Searches;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Collectors;
import java.util.List;

public class SearchesTest {
    @Test
    void testFindUserFamilyNameBySomeImproperFraction() {
        assertEquals(List.of("Fernandez", "Blanco", "López", "Torres", "Blanco", "Torres"), new Searches().findUserFamilyNameBySomeImproperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindDecimalFractionByUserName() {
        assertEquals(List.of(0.0, 1.0, 2.0, 0.2, -0.5, 0.5, 1.0), new Searches().findDecimalFractionByUserName("Oscar")
                . collect(Collectors.toList()));
    }
}
