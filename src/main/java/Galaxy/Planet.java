package Galaxy;

public class Planet implements Galactic {
    private double size;
    private double habitability;
    private String name;
    private planetType type;

    public enum planetType{
        GASEOUS("Gas Giant"),
        NEPTUNIAN("Neptunian"),
        SUPEREARTH("Super-Earth"),
        TERRESTIAL("Terrestrial");
        private final String s;
        planetType(String s){
            this.s = s;
        }

        public String getS() {
            return s;
        }
    }

    public Planet(String name, double size, double habitability, planetType type){
        this.name = name;
        this.size = size;
        this.habitability = habitability;
        this.type = type;
    }

    @Override
    public String description(){
        return String.format("Planet: %s\nSize: %.0f\nHabitability: %.0f\nType: %s\n", name, size, habitability, type.getS());
    }
}
