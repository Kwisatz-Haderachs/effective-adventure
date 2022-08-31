import Galaxy.Galaxy;
import Spacefaring.Spaceship;
import Spacefaring.StarTrek;
import Galaxy.Galaxy;
import Galaxy.Planet;
import Galaxy.SolarSystem;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    public Generator(){

    }
    public List<Galaxy> generateGalaxy(int size){
        List<Galaxy> galaxies = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String galaxyName = generateRandomString();
            Galaxy galaxy = new Galaxy(galaxyName);
            int solarSystems = (int) (Math.random()*100);
            galaxy.addSolarSystems(autoGenerateSolarSystems(solarSystems));
            galaxies.add(galaxy);
        }
        return galaxies;
    }
    public List<SolarSystem> autoGenerateSolarSystems(int sizeList){
        List<SolarSystem> solarSystems = new ArrayList<>();
        for (int i = 0; i < sizeList; i++) {
            String name = generateRandomString();
            Random rand = new Random();
            int planetSize = rand.nextInt(3,21);
            List<Planet> planetList = autoGeneratePlanetList(planetSize);
            double size = Math.random()*10000;
            SolarSystem ss = new SolarSystem(name, planetList, size);
            solarSystems.add(ss);
        }
        return solarSystems;

    }

    public List<Planet> autoGeneratePlanetList(int sizeList){
        List<Planet> planetList = new ArrayList<>();
        for (int i = 0; i < sizeList; i++) {
            String name = generateRandomString();
            double habitability = Math.random()*100;
            double size = Math.random()*100;
            Planet.planetType pType = generatePlanetType(habitability, size);
            Planet p = new Planet(name, size, habitability, pType);
            planetList.add(p);
        }
        return planetList;
    }
    public String generateRandomString(){
        byte[] arr = new byte[7];
        new Random().nextBytes(arr);
        return new String(arr, StandardCharsets.UTF_8);
    }
    public Planet.planetType generatePlanetType(double habit, double size){
        Planet.planetType p;
        Random rand = new Random();
        int r = rand.nextInt(4);
        if(habit < 50 && size <80){
            p = Planet.planetType.NEPTUNIAN;
        } else if (habit > 80 && size > 80) {
            p = Planet.planetType.SUPEREARTH;
        } else if (habit > 50) {
            p = Planet.planetType.TERRESTIAL;
        }else {
            p = Planet.planetType.GASEOUS;
        }
        return p;
    }
}
