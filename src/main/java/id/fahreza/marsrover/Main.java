package id.fahreza.marsrover;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maximumX = 0;
        int maximumY = 0;
        List<MarsRover> marsRovers = new ArrayList<>();

        if (scanner.hasNextLine()) {
            String[] lineArray = scanner.nextLine().split(" ");
            maximumX = new Integer(lineArray[0]);
            maximumY = new Integer(lineArray[1]);
        }

        boolean isFinished = false;
        MarsRover marsRover = null;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty())
                break;
            if (!isFinished) {
                String[] lineArray = line.split(" ");
                marsRover = new MarsRover(maximumX, maximumY, new Integer(lineArray[0]), new Integer(lineArray[1]),
                        lineArray[2]);
                isFinished = true;
            } else {
                marsRover.move(line);
                marsRovers.add(marsRover);
                isFinished = false;
            }
        }

        scanner.close();
        for (MarsRover marsRoverResult : marsRovers) {
            System.out.println(marsRoverResult.getCurrentX() + " " + marsRoverResult.getCurrentY() + " "
                    + marsRoverResult.getCurrentOrientation());
        }
    }

}
