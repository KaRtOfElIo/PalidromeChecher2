//топот
//Лёша на по!!лке кло!па нашёл
//Deed
//Привет
public class PalindromeChecker {
    public static boolean isPalindrome(String text) {
        String lowerText = text.toLowerCase();
        String cleanedText = lowerText.replaceAll("[^a-z0-9а-я]", "");
        String reversedText = new StringBuilder(cleanedText).reverse().toString();
        return cleanedText.equals(reversedText);
    }

    public static void main(String[] args) {
        String test1 = "топот";
        String test2 = "Лёша на по!!лке кло!па нашёл";
        String test3 = "Deed";
        String test4 = "Привет";

        System.out.println("--- Проверка палиндромов ---");

        System.out.println("'" + test1 + "': " + isPalindrome(test1));
        System.out.println("'" + test2 + "': " + isPalindrome(test2));
        System.out.println("'" + test3 + "': " + isPalindrome(test3));
        System.out.println("'" + test4 + "': " + isPalindrome(test4));
    }
}