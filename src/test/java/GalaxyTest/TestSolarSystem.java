package GalaxyTest;

import Galaxy.Planet;
import Galaxy.SolarSystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolarSystem {
    SolarSystem origin;
    @BeforeEach
    void init(){
        Planet earth = new Planet("Earth", 88, 95, Planet.planetType.TERRESTIAL);
        Planet mars = new Planet("Mars", 86,34, Planet.planetType.TERRESTIAL);
        Planet jupiter = new Planet("Jupiter", 103, 0, Planet.planetType.GASEOUS);
        List<Planet> solarOrigin = new ArrayList<>();
        solarOrigin.add(earth);
        solarOrigin.add(mars);
        solarOrigin.add(jupiter);
        origin = new SolarSystem("Ancestral", solarOrigin, 40);
    }
    @Test
    void addPlanet(){
        Planet neptune = new Planet("Neptune", 91, 1, Planet.planetType.NEPTUNIAN);
        origin.addPlanet(neptune);
    }
    @Test
    void testDescription(){
        String desc = """
                Solar System: Ancestral
                Planet: Earth\s
                Size: 88
                Habitability: 95
                Type: Terrestrial
                                
                Planet: Mars\s
                Size: 86
                Habitability: 34
                Type: Terrestrial
                                
                Planet: Jupiter\s
                Size: 103
                Habitability: 0
                Type: Gas Giant
                
                """;
        assertEquals(desc, origin.description());
    }
}
