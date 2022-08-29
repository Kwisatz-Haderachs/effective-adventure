package GalaxyTest;

import Galaxy.Planet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPlanet {
    Planet earth;
    Planet mars;
    Planet jupiter;
    @BeforeEach
    void init(){
        earth = new Planet("Earth", 88, 95, Planet.planetType.TERRESTIAL);
        mars = new Planet("Mars", 86,34, Planet.planetType.TERRESTIAL);
        jupiter = new Planet("Jupiter", 103, 0, Planet.planetType.GASEOUS);
    }
    @Test
    void print(){
        String e = """
                Planet: Earth
                Size: 88
                Habitability: 95
                Type: Terrestrial
                """;
        String m = """
                Planet: Mars
                Size: 86
                Habitability: 34
                Type: Terrestrial
                """;
        String j = """
                Planet: Jupiter
                Size: 103
                Habitability: 0
                Type: Gas Giant
                """;
        assertEquals(e.trim(), earth.description().trim());
        assertEquals(m.trim(), mars.description().trim());
        assertEquals(j.trim(), jupiter.description().trim());
    }
}
