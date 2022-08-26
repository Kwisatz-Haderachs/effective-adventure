package Galaxy;

import java.util.List;

public class SolarSystem implements Galactic {
    private List<Planet> planetList;
    private double size;
    private String name;

    public SolarSystem(String name, List<Planet> planetList){
        this.name = name;
        this.planetList = planetList;
    }

    public void addPlanet(Planet planet){
        this.planetList.add(planet);
    }

    @Override
    public String description() {
        StringBuilder sb = new StringBuilder();
        sb.append("Solar System: ").append(name).append("\n");
        for (Planet p : planetList) {
            sb.append(p.description());
        }

        return sb.toString();
    }
}
