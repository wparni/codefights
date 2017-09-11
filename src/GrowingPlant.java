/**
 * Created by Arni on 2017-07-19.
 */
public class GrowingPlant {


    static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int days = 0;
        int result = 0;

        while (result <= desiredHeight) {
            result += upSpeed;
            if (result >= desiredHeight) {
                days++;
                break;
            }else{
                result -= downSpeed;
            }
            days++;
        }
        return days;
    }


    public static void main(String[] args) {

        int upSpeed = 10;
        int downSpeed = 9;
        int desireHeight = 4;

        System.out.println(growingPlant(upSpeed, downSpeed, desireHeight));
    }
}

