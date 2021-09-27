package practica;

import es.upm.miw.iwvg_devops.practica.Searches;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Collectors;
import java.util.List;

public class SearchesTest {
    @Test
    void testFindUserFamilyNameBySomeImproperFraction() {
        assertEquals(List.of("Fernandez", "Blanco", "López", "Torres"), new Searches().findUserFamilyNameBySomeImproperFraction()
                .collect(Collectors.toList()));
    }
}
