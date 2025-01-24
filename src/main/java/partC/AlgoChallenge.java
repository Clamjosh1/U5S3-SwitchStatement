package partC;

public class AlgoChallenge {

    public static Boolean dogTrouble(boolean bulldogGrowl, boolean labGrowl) {
        if (bulldogGrowl && labGrowl) {
            return true;
        } else if (!bulldogGrowl && !labGrowl) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean puppyCry(boolean crying, int hour) {
        if (crying && (hour < 7 || hour > 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(dogTrouble(true, true));
        System.out.println(dogTrouble(false, false));
        System.out.println(dogTrouble(true, false));

        System.out.println(puppyCry(true, 6));
        System.out.println(puppyCry(true, 7));
        System.out.println(puppyCry(false, 6));
    }
}
