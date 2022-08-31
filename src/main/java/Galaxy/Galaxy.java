package Galaxy;

import java.util.ArrayList;
import java.util.List;

public class Galaxy implements Galactic {
    private List<SolarSystem> systems;
    private String name;
    public Galaxy(String name){
        systems = new ArrayList<>();
        this.name = name;
    }
    public void addSystem(SolarSystem system){
        systems.add(system);
    }
    public void addSolarSystems(List<SolarSystem> list){
        for (SolarSystem s: list) {
            addSystem(s);
        }
    }
    public List<SolarSystem> getSystems(){
        return systems;
    }

    @Override
    public String description() {
        StringBuilder sb = new StringBuilder();
        sb.append("Galaxy: ").append(name).append("\n");
        for (SolarSystem sys: systems) {
            sb.append(sys.description()).append("\n");
        }
        return sb.toString();
    }
}
