package Spacefaring;

import Galaxy.Planet;

public class StarTrek implements Spaceship{

    private static double driveEff = 0.9;
    private String name;
    private StarshipClass sClass;
    private double shieldStatus;
    private double weaponStatus;
    private String location;
    private double driveStatus;

    public StarTrek(String name, StarshipClass sClass, String coords){
        this.name = name;
        this.sClass = sClass;
        this.location = coords;
        this.shieldStatus = 100;
        this.weaponStatus = 100;
        this.driveStatus = 100;
    }

    public double getShieldStatus() {
        return shieldStatus;
    }

    public void setShieldStatus(double shieldStatus) {
        this.shieldStatus = shieldStatus;
    }

    public double getWeaponStatus() {
        return weaponStatus;
    }

    public void setWeaponStatus(double weaponStatus) {
        this.weaponStatus = weaponStatus;
    }

    public double getDriveStatus() {return driveStatus;}

    public void setDriveStatus(double driveStatus) {this.driveStatus = driveStatus;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsClass() {
        return sClass.getS();
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
                name, location,weaponStatus, shieldStatus);
    }
    @Override
    public void navigate(String destination){
        double drain = driveStatus - (calculateDistance(destination) * driveEff);
        setDriveStatus(drain);
        setLocation(destination);
    }

    private double calculateDistance(String destination) {
        String[] sCoords = location.split(":");
        String[] eCoords = destination.split(":");
        double start = Double.parseDouble(sCoords[0]);
        double end = Double.parseDouble(eCoords[0]);
        return Math.abs(start-end);
    }
}
