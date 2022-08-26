package Galaxy;

public class Planet implements Galaxy{
    private double size;
    private boolean habitable;
    private String name;
    private planetType type;

    public enum planetType{
        GASEOUS("Gas Giant"),
        NEPTUNIAN("Neptunian"),
        SUPEREARTH("super-Earth"),
        TERRESTIAL("terrestial");
        private final String s;
        planetType(String s){
            this.s = s;
        }

        public String getS() {
            return s;
        }
    }

    public Planet(){

    }

    @Override
    public String description(){
        return "";
    }
}
