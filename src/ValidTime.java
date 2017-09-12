
public class ValidTime {

    static boolean validTime(String time) {
        String[] splitTime = time.split(":");

        if (Integer.parseInt(splitTime[0]) >= 24) {
            return false;
        }
        else if (Integer.parseInt(splitTime[1]) >= 60) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String time = "13:58";

        System.out.println(validTime(time));
    }
}
