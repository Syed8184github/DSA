import java.util.Scanner;

public class VowelConsonantCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // read the input string
        String inputString = sc.nextLine();

        // initialize variables to store vowel and consonant count
        int vowelCount = 0;
        int consonantCount = 0;

        // loop through each character in the string
        for (char ch : inputString.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("AEIOUaeiou".indexOf(ch) != -1) {
                    // increment vowel count if the character is a vowel
                    vowelCount++;
                } else {
                    // increment consonant count if the character is a consonant
                    consonantCount++;
                }
            }
        }

        // print the results
        System.out.println("Number of vowels:"+vowelCount);
        System.out.println("Number of consonants:"+consonantCount);
    }
}
