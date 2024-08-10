package Course_Topics;

import java.util.Scanner;

public class String_Functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Original String: \""+input+"\"");
        // 1. Length of the string
        System.out.println("1. Length: " + input.length());
        // 2. Convert to uppercase
        System.out.println("2. Uppercase: " + input.toUpperCase());
        // 3. Convert to lowercase
        System.out.println("3. Lowercase: " + input.toLowerCase());
        // 4. Check if string is empty
        System.out.println("4. Is Empty: " + input.isEmpty());
        // 5. Replace 'a' with 'o'
        System.out.println("5. Replace 'a' with 'o': " + input.replace('a', 'o'));
        // 6. Substring from index 2 to 5
        if (input.length() > 5) {
            System.out.println("6. Substring (2 to 5): " + input.substring(2, 5));
        } else {
            System.out.println("6. Substring (2 to 5): String too short");
        }
        // 7. Character at index 3
        if (input.length() > 3) {
            System.out.println("7. Char at index 3: " + input.charAt(3));
        } else {
            System.out.println("7. Char at index 3: String too short");
        }
        // 8. Index of first occurrence of 'a'
        System.out.println("8. Index of 'a': " + input.indexOf('a'));
        // 9. Last index of 'a'
        System.out.println("9. Last index of 'a': " + input.lastIndexOf('a'));
        // 10. Concatenate with another string
        System.out.println("10. Concatenate with ' - Java': " + input.concat(" - Java"));
        // 11. Starts with "Hello"
        System.out.println("11. Starts with 'Hello': " + input.startsWith("Hello"));
        // 12. Ends with "World"
        System.out.println("12. Ends with 'World': " + input.endsWith("World"));
        // 13. Trim leading and trailing spaces
        System.out.println("13. Trimmed: " + input.trim());
        // 14. Convert string to char array
        char[] charArray = input.toCharArray();
        System.out.print("14. Char array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        // 15. Split string by space
        String[] words = input.split(" ");
        System.out.print("15. Split by space: ");
        for (String word : words) {
            System.out.print(word + " | ");
        }
        System.out.println();
        // 16. String contains "Java"
        System.out.println("16. Contains 'Java': " + input.contains("Java"));
        // 17. Compare with another string "example"
        System.out.println("17. Compare with 'example': " + input.compareTo("example"));
        // 18. Convert int to string
        int num = 123;
        String numString = String.valueOf(num);
        System.out.println("18. Convert int to string: " + numString);
        // 19. Check if string equals "Hello"
        System.out.println("19. Equals 'Hello': " + input.equals("Hello"));
        // 20. Check if string equalsIgnoreCase "HELLO"
        System.out.println("20. EqualsIgnoreCase 'HELLO': " + input.equalsIgnoreCase("HELLO"));
        // 21. Replace all vowels with '*'
        System.out.println("21. Replace vowels with '*': " + input.replaceAll("[AEIOUaeiou]", "*"));
        // 22. Format string with variables
        String formattedString = String.format("Name: %s, Age: %d", "Alice", 25);
        System.out.println("22. Formatted string: " + formattedString);
        // 23. Check if matches a regular expression (alphanumeric)
        System.out.println("23. Matches alphanumeric regex: " + input.matches("[a-zA-Z0-9]+"));
        // 24. Get bytes of the string
        byte[] byteArray = input.getBytes();
        System.out.print("24. Get bytes: ");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
        System.out.println();
        // 25. Join an array of strings with a delimiter
        String[] stringArray = { "Java", "is", "fun" };
        String joinedString = String.join(" ", stringArray);
        System.out.println("25. Joined string: " + joinedString);
        scanner.close();
    }
}
