import Galaxy.Galaxy;
import Spacefaring.Spaceship;
import Spacefaring.StarTrek;

public class main {
    public static void main(String[] args) {
        StarTrek starTrek = new StarTrek("Enterprise", Spaceship.StarshipClass.EXPLORATORY, "Earth");

        Galaxy galaxy = new Galaxy("Andomeda");
        Galaxy galaxy1 = new Galaxy("Milky Way");


    }
}
