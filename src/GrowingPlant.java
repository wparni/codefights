/**
 Each day a plant is growing by upSpeed meters.
 Each night that plant's height decreases by downSpeed meters due to the lack of sun heat.
 Initially, plant is 0 meters tall. We plant the seed at the beginning of a day.
 We want to know when the height of the plant will reach a certain level.
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

