package id.fahreza.marsrover;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {

    @Test
    public void testInitMaxCoordinate_givenUpperRightCoordinate_shouldReturnUpperRightCoordinate() {
        int x = 3, y = 3;
        MarsRover marsRover = new MarsRover(x, y);
        Assert.assertEquals(x, marsRover.getMaximumX());
        Assert.assertEquals(y, marsRover.getMaximumY());
    }
    
    @Test
    public void testInitRoverCoordinate_givenRoverCoordinate_shouldCurrentRoverCoordinate() {
        int x = 3, y = 3, roverX = 2, roverY = 2;
        MarsRover marsRover = new MarsRover(x, y, roverX, roverY);
        Assert.assertEquals(roverX, marsRover.getCurrentX());
        Assert.assertEquals(roverY, marsRover.getCurrentY());
    }

}
