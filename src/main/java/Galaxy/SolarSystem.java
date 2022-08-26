package Galaxy;

import java.util.List;

public class SolarSystem implements Galaxy{
    private List<Planet> planetList;
    private double size;
    private String name;

    public SolarSystem(String name, List<Planet> planetList){
        this.name = name;
        this.planetList = planetList;
    }


    @Override
    public String description() {
        return null;
    }
}
