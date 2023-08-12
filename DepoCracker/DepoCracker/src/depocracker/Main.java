package depocracker;

import java.awt.*;
import java.awt.event.InputEvent;

public class Main {
    public static void main(String[] args) {
    	String ID = "why";
        EventQueue.invokeLater(() -> {
            teleportSequenceWithCustomStep();
        });
    }

    public static void teleportSequenceWithCustomStep() {
        try {
            Robot robot = new Robot();

            for (int i = 0; i <= 9999; i++) {
                String value = String.format("%04d", i);

                int digit0 = Character.getNumericValue(value.charAt(0));
                int digit1 = Character.getNumericValue(value.charAt(1));
                int digit2 = Character.getNumericValue(value.charAt(2));
                int digit3 = Character.getNumericValue(value.charAt(3));

                teleportAndClickCoordinate(robot, digit0);
                teleportAndClickCoordinate(robot, digit1);
                teleportAndClickCoordinate(robot, digit2);
                teleportAndClickCoordinate(robot, digit3);
                robot.delay(50);
                teleportAndClickCoordinate(robot, 10);
                robot.delay(250);
                teleportAndClickCoordinate(robot, 11);
            }

        } catch (AWTException ex) {
            ex.printStackTrace();
        }
    }

    private static void teleportAndClickCoordinate(Robot robot, int digit) {
        int targetX, targetY;

        switch (digit) {
            case 0:
                targetX = 685;
                targetY = 483;
                break;
            case 1:
                targetX = 641;
                targetY = 351;
                break;
            case 2:
                targetX = 687;
                targetY = 351;
                break;
            case 3:
                targetX = 729;
                targetY = 350;
                break;
            case 4:
                targetX = 642;
                targetY = 397;
                break;
            case 5:
                targetX = 685;
                targetY = 397;
                break;
            case 6:
                targetX = 729;
                targetY = 397;
                break;
            case 7:
                targetX = 641;
                targetY = 439;
                break;
            case 8:
                targetX = 684;
                targetY = 439;
                break;
            case 9:
                targetX = 731;
                targetY = 438;
                break;
            case 10:
                targetX = 729;
                targetY = 483;
                break;
            case 11:
                targetX = 614;
                targetY = 390;
                break;
            default:
                targetX = 0;
                targetY = 0;
                break;
        }

        robot.mouseMove(targetX, targetY);
        robot.delay(100);

        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        robot.delay(100);
    }
}
