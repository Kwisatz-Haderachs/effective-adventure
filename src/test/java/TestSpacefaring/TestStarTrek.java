package TestSpacefaring;

import Galaxy.Planet;
import Spacefaring.Spaceship;
import Spacefaring.StarTrek;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStarTrek {
    StarTrek trek;
    @BeforeEach
    void init(){
        trek = new StarTrek("Enterprise", Spaceship.StarshipClass.EXPLORATORY, "10:34:21:32");
    }
    @Nested
    class modify {
        @Test
        void testShieldStatus() {
            assertEquals(100, trek.getShieldStatus());
            trek.setShieldStatus(80);
            assertEquals(80, trek.getShieldStatus());
        }

        @Test
        void testWeaponStatus() {
            assertEquals(100, trek.getWeaponStatus());
            trek.setWeaponStatus(80);
            assertEquals(80, trek.getWeaponStatus());
        }

        @Test
        void testGetName() {
            assertEquals("Enterprise", trek.getName());
            trek.setName("Voyager");
            assertEquals("Voyager", trek.getName());
        }
        @Test
        void testGetsClass() {
            assertEquals("Exploratory", trek.getsClass());
        }
        @Test
        void testLocation() {
            assertEquals("10:34:21:32", trek.getLocation());
            trek.setLocation("11:34:21:32");
            assertEquals("11:34:21:32", trek.getLocation());
        }

    }

    @Test
    void testNavigateCalculateDist(){
        trek.navigate("10:34:21:32");
        assertEquals(100, trek.getDriveStatus());
        trek.navigate("01:34:21:32");
        double drain = 100 - (9 * .9);
        assertEquals(drain, trek.getDriveStatus());
        trek.navigate("11:34:21:32");
        drain -= (10 * .9);
        assertEquals(drain, trek.getDriveStatus());
    }
}
