package string;

public class RemoveExtraCharAndMatchTwoString {

    public static char findExtraCharacter(String str1, String str2) {
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Count characters in str1
        for (char c : str1.toCharArray()) {
            charCount[c]++;
            System.out.println(c+" "+ charCount[c]);
        }

        // Subtract count of characters in str2
        for (char c : str2.toCharArray()) {
            charCount[c]--;
            System.out.println(c+" "+charCount[c]);
        }

        // Find the character with count 1
        for (char c : str1.toCharArray()) {
            if (charCount[c] == 1) {
                return c;
            }
        }

        return '\0'; // Return null character if no extra character found
    }

    public static void main(String[] args) {
        String str1 = "aabcgd";
        String str2 = "abcgd";
        char extraChar = findExtraCharacter(str1, str2);
        if (extraChar != '\0') {
            System.out.println("The extra character is: " + extraChar);
        } else {
            System.out.println("No extra character found.");
        }

    }
}
