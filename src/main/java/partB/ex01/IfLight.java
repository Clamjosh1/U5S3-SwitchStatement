package partB.ex01;

import java.util.Scanner;

public class IfLight {
    public static String ifLight() {
        String response = "";

        // make a scanner to read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a color code:");


        int currentColor = scanner.nextInt();


        if (currentColor == 0) {
            response = "Next Traffic Light is green";
        } else if (currentColor == 1) {
            response = "Next Traffic Light is yellow";
        } else if (currentColor == 2) {
            response = "Next Traffic Light is red";
        } else {
            response = "Invalid color";
        }

        return response;
    }

    public static void main(String args[]) {
        String switchOutput = ifLight();
        System.out.println(switchOutput);
    }
}
