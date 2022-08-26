package Spacefaring;

public class StarTrek implements Spaceship{
    private String name;
    private StarshipClass sClass;
    private double shiledStatus;
    private double weaponStatus;
    private String location;
    private double driveStatus;

    public StarTrek(String name, StarshipClass sClass, String location){
        this.name = name;
        this.sClass = sClass;
        this.location = location;
    }

    public double getShiledStatus() {
        return shiledStatus;
    }

    public void setShiledStatus(double shiledStatus) {
        this.shiledStatus = shiledStatus;
    }

    public double getWeaponStatus() {
        return weaponStatus;
    }

    public void setWeaponStatus(double weaponStatus) {
        this.weaponStatus = weaponStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StarshipClass getsClass() {
        return sClass;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String printStatus() {
        return String.format("Starship: %s currently located at %s.\nWeapons status: %f.0\nShield status: %f.0",
                name, location,weaponStatus, shiledStatus);
    }
    @Override
    public void navigate(String currentLoc, String destination){
        double lightyears = calculateDistance(currentLoc, destination);
    }

    private double calculateDistance(String currentLoc, String destination) {
        String[] sCoords = currentLoc.split(":");
        String[] eCoords = currentLoc.split(":");
        double start = Double.parseDouble(sCoords[0]);
        double end = Double.parseDouble(eCoords[0]);
        return Math.abs(start-end);
    }
}
