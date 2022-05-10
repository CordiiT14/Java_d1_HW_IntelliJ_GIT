import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class WaterBottleTest {

    WaterBottle evian;

    @Before
    public void before(){
        evian = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, evian.getVolume());
    }

    @Test
    public void canDrink(){
        evian.drink();
        assertEquals(90, evian.getVolume() );
    }

    @Test
    public void canEmptyBottle(){
        evian.empty();
        assertEquals(0, evian.getVolume());
    }

    @Test
    public void canFillBottle(){
        evian.empty();
        assertEquals(0, evian.getVolume());
        evian.fill();
        assertEquals(100, evian.getVolume());
    }
}
