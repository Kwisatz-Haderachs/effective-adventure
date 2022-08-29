package GalaxyTest;

import Galaxy.Planet;
import Galaxy.SolarSystem;
import Galaxy.Galaxy;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGalaxy {
    @Test
    void print(){
        Galaxy g = new Galaxy("Milky Way");
        assertEquals("Galaxy: Milky Way", g.description().trim());
    }
    @Test
    void addSys(){
        Planet earth = new Planet("Earth", 88, 95, Planet.planetType.TERRESTIAL);
        Planet mars = new Planet("Mars", 86,34, Planet.planetType.TERRESTIAL);
        Planet jupiter = new Planet("Jupiter", 103, 0, Planet.planetType.GASEOUS);
        List<Planet> planetList = new ArrayList<>();
        planetList.add(earth);
        planetList.add(mars);
        planetList.add(jupiter);
        SolarSystem x = new SolarSystem("Ancestral",planetList, 45);
        Galaxy g = new Galaxy("Milky Way");
        g.addSystem(x);
        String e = """
                Planet: Earth
                Size: 88
                Habitability: 95
                Type: Terrestrial
                """;
        assertEquals(e.trim(), g.getSystems().get(0).getPlanetList().get(0).description().trim());
    }
}
