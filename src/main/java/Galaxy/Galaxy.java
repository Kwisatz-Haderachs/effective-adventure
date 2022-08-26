package Galaxy;

import java.util.List;

public class Galaxy implements Galactic {
    private List<SolarSystem> systems;
    private String name;
    public Galaxy(String name){
        this.name = name;
    }
    public void addSystem(SolarSystem system){
        systems.add(system);
    }

    @Override
    public String description() {
        StringBuilder sb = new StringBuilder();
        for (SolarSystem sys: systems) {
            sb.append(sys.description());
        }
        return sb.toString();
    }
}
