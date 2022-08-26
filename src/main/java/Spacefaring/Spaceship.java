package Spacefaring;

public interface Spaceship {

    public enum StarshipClass{
        DESTROYER("Destroyer"),
        CRUISER("Cruiser"),
        EXPLORATORY("Explorer"),
        WARSHIP("Warship"),
        CORVETTE("Corvette"),
        BATTLECRUISER("Battlecruiser"),
        TRANSPORTER("Transport");
        String s;
        public String getS(){
            return s;
        }

        StarshipClass(String s) {
        }
    }
    public String printStatus();
    public void navigate(String start, String end);


}
