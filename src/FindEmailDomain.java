
/**
 * An email address such as "John.Smith@example.com" is made up of a local part ("John.Smith"), an "@" symbol, then a domain part ("example.com").
 * The domain name part of an email address may only consist of letters, digits, hyphens and dots.
 * The local part, however, also allows a lot of different special characters. Here you can look at several examples of correct and incorrect email addresses.
 * Given a valid email address, find its domain part.
 */

public class FindEmailDomain {
    static String findEmailDomain(String address) {
        String domain = "";
        int index = 0;

        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '@') {
                index = i;
            }
        }
        for (int i = index + 1; i < address.length(); i++) {
            domain += address.charAt(i);
        }
        return domain;
    }

    public static void main(String[] args) {


        String test = "prettyandsimple@example.com";

        System.out.println(findEmailDomain(test));
    }
}
