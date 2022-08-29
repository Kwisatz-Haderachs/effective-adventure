
import Spacefaring.Spaceship;
import Spacefaring.StarTrek;
import Galaxy.Galaxy;
import Galaxy.Planet;
import Galaxy.SolarSystem;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        StarTrek starTrek = new StarTrek("Enterprise", Spaceship.StarshipClass.EXPLORATORY, "12:23:23:21");
        Planet earth = new Planet("Earth", 88, 95, Planet.planetType.TERRESTIAL);
        Planet mars = new Planet("Mars", 86,34, Planet.planetType.TERRESTIAL);
        Planet jupiter = new Planet("Jupiter", 103, 0, Planet.planetType.GASEOUS);
        System.out.println(earth.description());
        System.out.println(mars.description());
        System.out.println(jupiter.description());

    }
    public static void autoGenerate(){
        List<Planet> planetList = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            Planet p = new Planet();

            planetList.add(x);
        }

    }
}
