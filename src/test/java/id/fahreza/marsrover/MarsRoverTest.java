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
    
    @Test
    public void testMoveRover_givenMoveCommand_shouldReturnCurrentYPlus1() {
        int x = 3, y = 3, roverX = 2, roverY = 2;
        MarsRover marsRover = new MarsRover(x, y, roverX, roverY);
        marsRover.move("M");
        Assert.assertEquals(roverY + 1, marsRover.getCurrentY());
    }
    
    @Test
    public void testMoveRover_givenMoveCommand_shouldReturnCurrentXPlus1() {
        int x = 3, y = 3, roverX = 2, roverY = 2;
        MarsRover marsRover = new MarsRover(x, y, roverX, roverY, "E");
        marsRover.move("M");
        Assert.assertEquals(roverX + 1, marsRover.getCurrentX());
    }
    
    @Test
    public void testSerialMoveRover_givenMoveAndTurnLeftCommands_shouldReturn1OnCurrentX() {
        int x = 5, y = 5, roverX = 1, roverY = 2;
        MarsRover marsRover = new MarsRover(x, y, roverX, roverY, "N");
        marsRover.move("LMLMLMLMM");
        Assert.assertEquals(1, marsRover.getCurrentX());
    }
    
    @Test
    public void testSerialMoveRover_givenMoveAndTurnLeftCommands_shouldReturn3OnCurrentY() {
        int x = 5, y = 5, roverX = 1, roverY = 2;
        MarsRover marsRover = new MarsRover(x, y, roverX, roverY, "N");
        marsRover.move("LMLMLMLMM");
        Assert.assertEquals(3, marsRover.getCurrentY());
    }

    @Test
    public void testSerialMoveRover_givenMoveAndTurnLeftCommands_shouldReturnNorthOnCurrentOrientiation() {
        int x = 5, y = 5, roverX = 1, roverY = 2;
        MarsRover marsRover = new MarsRover(x, y, roverX, roverY, "N");
        marsRover.move("LMLMLMLMM");
        Assert.assertEquals("N", marsRover.getCurrentOrientation());
    }

    @Test
    public void testSerialMoveRover_givenMoveAndTurnRightCommands_shouldReturn5OnCurrentX() {
        int x = 5, y = 5, roverX = 3, roverY = 3;
        MarsRover marsRover = new MarsRover(x, y, roverX, roverY, "E");
        marsRover.move("MMRMMRMRRM");
        Assert.assertEquals(5, marsRover.getCurrentX());
    }
    
    @Test
    public void testSerialMoveRover_givenMoveAndTurnRightCommands_shouldReturn1OnCurrentY() {
        int x = 5, y = 5, roverX = 3, roverY = 3;
        MarsRover marsRover = new MarsRover(x, y, roverX, roverY, "E");
        marsRover.move("MMRMMRMRRM");
        Assert.assertEquals(1, marsRover.getCurrentY());
    }

    @Test
    public void testSerialMoveRover_givenMoveAndTurnRightCommands_shouldReturnEastOnCurrentOrientiation() {
        int x = 5, y = 5, roverX = 3, roverY = 3;
        MarsRover marsRover = new MarsRover(x, y, roverX, roverY, "E");
        marsRover.move("MMRMMRMRRM");
        Assert.assertEquals("E", marsRover.getCurrentOrientation());
    }

}
