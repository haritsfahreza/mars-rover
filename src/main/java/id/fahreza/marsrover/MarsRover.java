package id.fahreza.marsrover;

import java.util.Arrays;

public class MarsRover {

    private final String[] ORIENTATIONS = new String[] { "N", "E", "S", "W" };

    private int maximumX = 0, maximumY = 0, currentX = 0, currentY = 0, currentOrientation = 0;

    public MarsRover(int maximumX, int maximumY) {
        this.maximumX = maximumX;
        this.maximumY = maximumY;
    }

    public MarsRover(int maximumX, int maximumY, int currentX, int currentY) {
        this(maximumX, maximumY);
        this.currentX = currentX;
        this.currentY = currentY;
    }

    public MarsRover(int maximumX, int maximumY, String currentOrientation) {
        this(maximumX, maximumY);
        this.currentOrientation = Arrays.binarySearch(ORIENTATIONS, currentOrientation);
    }

    public MarsRover(int maximumX, int maximumY, int currentX, int currentY, String currentOrientation) {
        this(maximumX, maximumY, currentX, currentY);
        this.currentOrientation = Arrays.binarySearch(ORIENTATIONS, currentOrientation);
    }

    public int getMaximumX() {
        return maximumX;
    }

    public int getMaximumY() {
        return maximumY;
    }

    public int getCurrentX() {
        return currentX;
    }

    public int getCurrentY() {
        return currentY;
    }

    public String getCurrentOrientation() {
        return ORIENTATIONS[currentOrientation];
    }

    public void move(String command) {
        if (command.equalsIgnoreCase("R")) {
            currentOrientation = currentOrientation + 1 > 3 ? 0 : currentOrientation + 1;
        } else if (command.equalsIgnoreCase("L")) {
            currentOrientation = currentOrientation - 1 < 0 ? 3 : currentOrientation - 1;
        }
    }

}