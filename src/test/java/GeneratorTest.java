import Galaxy.Galaxy;
import Galaxy.Planet;
import Galaxy.SolarSystem;
import org.junit.jupiter.api.Test;

import java.util.List;

public class GeneratorTest {
    @Test
    void randomString(){
        Generator generator = new Generator();
        System.out.println(generator.generateRandomString());
    }
    @Test
    void randomPlanet(){
        Generator generator = new Generator();
        System.out.println(generator.autoGeneratePlanetList(1).get(0).description());
    }
    @Test
    void randomPlanets(){
        Generator generator = new Generator();
        List<Planet> planetList = generator.autoGeneratePlanetList(5);
        for (Planet p: planetList) {
            System.out.println(p.description());
        }
    }
    @Test
    void randomSolarSystems(){
        Generator generator = new Generator();
        List<SolarSystem> ss = generator.autoGenerateSolarSystems(2);
        for (SolarSystem s: ss) {
            System.out.println(s.description());
        }
    }
    @Test
    void randomGalaxies(){
        Generator generator = new Generator();
        List<Galaxy> galaxies = generator.generateGalaxy(2);
        for (Galaxy g: galaxies) {
            System.out.println(g.description());
        }
    }
}
