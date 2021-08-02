public class Palindrome {
    public static void main(String[] args) {

        //TASK 2: Create the algorithm which will process the sentence and return the result - is this sentence a palindrome or not

        //FIRST TEST
        String palindrome1 = "Mom";
        //creating empty string to house the reversed string
        String reversePalindrome1= "";

        //initializing the length of the string
        int length = palindrome1.length();

        //takes characters (i) from last to first and puts them backwards into the empty string
        for (int i = length - 1; i >= 0 ; i--) {
            reversePalindrome1 = reversePalindrome1 + palindrome1.charAt(i);
        }

        //compares the two strings using equals method
        if (palindrome1.equalsIgnoreCase(reversePalindrome1)) {
            System.out.println(palindrome1 + " - is a palindrome!");
        } else System.out.println(palindrome1 + " - is not a palindrome!");



        //SECOND TEST
        String palindrome2 = "Was it a car or a cat I saw?";
        //removing all spaces and special characters from the string
        String palindrome2Edited = palindrome2.replaceAll("[^a-zA-Z0-9]", "");
        //creating empty string to house the reversed string
        String reversedPalindrome2 = "";

        //initializing the length of the string
        int length2 = palindrome2Edited.length();

        //takes characters (i) from last to first and puts them backwards into the empty string
        for (int i = length2 - 1; i >= 0 ; i--) {
            reversedPalindrome2 = reversedPalindrome2 + palindrome2Edited.charAt(i);
        }

        //compares the two strings using equals method
        if (palindrome2Edited.equalsIgnoreCase(reversedPalindrome2)) {
            System.out.println(palindrome2 + " - is a palindrome!");
        } else System.out.println(palindrome2 + " - is not a palindrome!");



        //THIRD TEST
        String palindrome3 = "Madam, in Eden, I’m Adam.";
        String palindrome3Edited = palindrome3.replaceAll("[^a-zA-Z0-9]", "");
        String reversedPalindrome3 = "";

        int length3 = palindrome3Edited.length();

        for (int i = length3 - 1; i >= 0 ; i--) {
            reversedPalindrome3 = reversedPalindrome3 + palindrome3Edited.charAt(i);
        }

        if (palindrome3Edited.equalsIgnoreCase(reversedPalindrome3)) {
            System.out.println(palindrome3 + " - is a palindrome!");
        } else System.out.println(palindrome3 + " - is not a palindrome!");



        //FOURTH TEST
        String palindrome4 = "Yo, banana boy!";
        String palindrome4Edited = palindrome4.replaceAll("[^a-zA-Z0-9]", "");
        String reversedPalindrome4 = "";

        int length4 = palindrome4Edited.length();

        for (int i = length4 - 1; i >= 0 ; i--) {
            reversedPalindrome4 = reversedPalindrome4 + palindrome4Edited.charAt(i);
        }

        if (palindrome4Edited.equalsIgnoreCase(reversedPalindrome4)) {
            System.out.println(palindrome4 + " - is a palindrome!");
        } else System.out.println(palindrome4 + " - is not a palindrome!");

    }
}

