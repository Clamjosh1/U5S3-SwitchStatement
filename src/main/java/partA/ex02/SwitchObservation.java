package partA.ex02;

public class SwitchObservation {

    public static String observation(){
        String response = "";

        char option = 'A';
        int aCount = 0, bCount = 0, cCount = 0;
        switch (option) {
            case 'A':
                aCount++;
                response += ("Count of A  " + aCount);
            case 'B':
                bCount++;
                response += (" Count of B  " + bCount);
            case 'C':
                cCount++;
                response += (" Count of C  " + cCount);
                break;
        }

        return response;
    }

    public static void main(String args[]) {
        String observationOutput = observation();
        System.out.println(observationOutput);
    }
}
