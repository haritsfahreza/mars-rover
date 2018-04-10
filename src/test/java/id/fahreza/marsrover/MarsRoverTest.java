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
    public void testInitRoverCoordinate_givenRoverCoordinate_shouldReturnCurrentRoverCoordinate() {
        int x = 3, y = 3, roverX = 2, roverY = 2;
        MarsRover marsRover = new MarsRover(x, y, roverX, roverY);
        Assert.assertEquals(roverX, marsRover.getCurrentX());
        Assert.assertEquals(roverY, marsRover.getCurrentY());
    }
    
    @Test
    public void testChangeRoverOrientation_givenTurnRightCommand_shouldReturnEastOrientation() {
        int x = 3, y = 3;
        MarsRover marsRover = new MarsRover(x, y);
        marsRover.move("R");
        Assert.assertEquals("E", marsRover.getCurrentOrientation());
    }
    
    @Test
    public void testChangeRoverOrientation_givenTurnLeftCommand_shouldReturnWestOrientation() {
        int x = 3, y = 3;
        MarsRover marsRover = new MarsRover(x, y);
        marsRover.move("L");
        Assert.assertEquals("W", marsRover.getCurrentOrientation());
    }

}
