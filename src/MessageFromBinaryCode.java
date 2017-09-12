/**
 * You are taking part in an Escape Room challenge designed specifically for programmers.
 * In your efforts to find a clue, you've found a binary code written on the wall behind a vase,
 * and realized that it must be an encrypted message.
 * After some thought, your first guess is that each consecutive 8 bits of the code stand for the character with the corresponding extended ASCII code.
 * Assuming that your hunch is correct, decode the message.
 */

import java.util.Arrays;

public class MessageFromBinaryCode {
    static String messageFromBinaryCode(String code) {

        StringBuilder stringBuilder = new StringBuilder();
        Arrays.stream(code.split("(?<=\\G.{8})")).forEach(s -> stringBuilder.append((char) Integer.parseInt(s, 2)));
        return stringBuilder.toString();

    }


    public static void main(String[] args) {

        String test = "010010000110010101101100011011000110111100100001";

        System.out.println(messageFromBinaryCode(test));
    }
}
