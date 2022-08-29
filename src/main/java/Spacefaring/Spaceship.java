package Spacefaring;

public interface Spaceship {

    enum StarshipClass{
        DESTROYER("Destroyer"),
        CRUISER("Cruiser"),
        EXPLORATORY("Exploratory"),
        WARSHIP("Warship"),
        CORVETTE("Corvette"),
        BATTLECRUISER("Battlecruiser"),
        TRANSPORTER("Transport");
        String s;
        public String getS(){
            return s;
        }

        StarshipClass(String s) {
            this.s = s;
        }
    }
    public String printStatus();
    public void navigate(String end);


}
