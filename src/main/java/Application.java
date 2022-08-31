
import Spacefaring.Spaceship;
import Spacefaring.StarTrek;
import Galaxy.Galaxy;
import Galaxy.Planet;
import Galaxy.SolarSystem;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        StarTrek starTrek = new StarTrek("Enterprise", Spaceship.StarshipClass.EXPLORATORY, "12:23:23:21");
        run();
    }
    public static void run(){
        List<Galaxy> galaxies;
        Generator generator = new Generator();
        galaxies = generator.generateGalaxy(3);
        System.out.println(galaxies.get(0).description());
    }

}
