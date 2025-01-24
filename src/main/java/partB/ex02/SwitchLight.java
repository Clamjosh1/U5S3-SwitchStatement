package partB.ex02;

import java.util.Scanner;

public class SwitchLight {
    public static String switchLight() {
        String response = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a color code:");
        int colorCode = scanner.nextInt();

        switch (colorCode) {
            case 1:
                response = "Red light is on!";
                break;
            case 2:
                response = "Green light is on!";
                break;
            case 3:
                response = "Blue light is on!";
                break;
            case 0:
                response = "Invalid color";
                break;
            default:
                response = "Invalid color";
                break;
        }

        return response;
    }

    public static void main(String args[]) {
        String switchOutput = switchLight();
        System.out.println(switchOutput);
    }
}
