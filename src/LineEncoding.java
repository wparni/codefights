/**Given a string, return its encoding defined as follows:
 First, the string is divided into the least possible number of disjoint substrings consisting of identical characters
 for example, "aabbbc" is divided into ["aa", "bbb", "c"]
 Next, each substring with length greater than one is replaced with a concatenation of its length and the repeating character
 for example, substring "bbb" is replaced by "3b"
 Finally, all the new strings are concatenated together in the same order and a new string is returned.*/

public class LineEncoding {

    static String lineEncoding(String s) {
        String result = "";
        int index = 1;

        s = s + "0";

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                index++;
            } else if (index != 1) {
                result += String.valueOf(index) + s.charAt(i);
                index = 1;
            }else if(index ==1){
                result += s.charAt(i);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String test = "aabbbc";
        System.out.println(lineEncoding(test));
    }
}
