import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WaterBottleTest {
    WaterBottle waterBottle;
    @Before public void setup() {
        waterBottle = new WaterBottle();
        waterBottle.fill();
    }
    @Test public void hasVolumeSet() {
        assertEquals(0, waterBottle.getVolume());
    }
    @Test public void canEmptyVolume() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }
    @Test public void canFillVolume() {
        waterBottle.empty();
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
    @Test public void canTakeDrink() {
        assertTrue(waterBottle.takeDrink());
        assertEquals(90, waterBottle.getVolume());
    }
    @Test public void canNotTakeDrinkIfNotEnoughVolume() {
        waterBottle.empty();
        assertFalse(waterBottle.takeDrink());
        assertEquals(0, waterBottle.getVolume());
    }
}
