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

    public void move(String commands) {
        for (String command : commands.split("")) {
            if (command.equalsIgnoreCase("R")) {
                currentOrientation = currentOrientation + 1 > 3 ? 0 : currentOrientation + 1;
            } else if (command.equalsIgnoreCase("L")) {
                currentOrientation = currentOrientation - 1 < 0 ? 3 : currentOrientation - 1;
            } else if (command.equalsIgnoreCase("M")) {
                if (currentOrientation == 0) {
                    currentY = currentY + 1 > maximumY ? maximumY : currentY + 1;
                } else if (currentOrientation == 1) {
                    currentX = currentX + 1 > maximumX ? maximumX : currentX + 1;
                } else if (currentOrientation == 2) {
                    currentY = currentY - 1 < 0 ? 0 : currentY - 1;
                } else if (currentOrientation == 3) {
                    currentX = currentX - 1 < 0 ? 0 : currentX - 1;
                }
            }
        }
    }

}
