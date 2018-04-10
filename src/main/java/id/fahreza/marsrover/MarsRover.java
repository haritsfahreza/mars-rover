package id.fahreza.marsrover;

public class MarsRover {

    private int maximumX = 0, maximumY = 0, currentX = 0, currentY = 0;

    public MarsRover(int maximumX, int maximumY) {
        this.maximumX = maximumX;
        this.maximumY = maximumY;
    }

    public MarsRover(int maximumX, int maximumY, int currentX, int currentY) {
        this.maximumX = maximumX;
        this.maximumY = maximumY;
        this.currentX = currentX;
        this.currentY = currentY;
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

}
