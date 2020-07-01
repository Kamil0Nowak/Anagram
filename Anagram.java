import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        }
        char[] a1 = firstWord.toLowerCase().toCharArray();
        char[] a2 = secondWord.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {

        if (isAnagram("aAss", "saas")){
            System.out.println("It's an anagram");
        }
        else {
            System.out.println("It's not an anagram");
        }
    }
}
