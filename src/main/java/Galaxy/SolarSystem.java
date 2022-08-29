package Galaxy;

import java.util.List;

public class SolarSystem implements Galactic {
    private List<Planet> planetList;
    private double size;
    private String name;

    public SolarSystem(String name, List<Planet> planetList, double size){
        this.name = name;
        this.planetList = planetList;
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void addPlanet(Planet planet){
        this.planetList.add(planet);
    }

    public List<Planet> getPlanetList(){
        return planetList;
    }

    @Override
    public String description() {
        StringBuilder sb = new StringBuilder();
        sb.append("Solar System: ").append(name).append("\n");
        for (Planet p : planetList) {
            sb.append(p.description()).append("\n");
        }
        return sb.toString();
    }
}
