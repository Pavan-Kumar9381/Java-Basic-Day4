public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Java Programming";

        // 1. length()
        System.out.println("Length of str1: " + str1.length());

        // 2. charAt()
        System.out.println("Character at index 4 in str1: " + str1.charAt(4));

        // 3. substring()
        System.out.println("Substring of str2 (0 to 4): " + str2.substring(0, 4));

        // 4. toUpperCase() and toLowerCase()
        System.out.println("Uppercase str1: " + str1.toUpperCase());
        System.out.println("Lowercase str2: " + str2.toLowerCase());

        // 5. equals() and equalsIgnoreCase()
        String str3 = "hello world";
        System.out.println("str1 equals str3? " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3? " + str1.equalsIgnoreCase(str3));

        // 6. contains()
        System.out.println("Does str2 contain 'Java'? " + str2.contains("Java"));

        // 7. startsWith() and endsWith()
        System.out.println("Does str1 start with 'Hello'? " + str1.startsWith("Hello"));
        System.out.println("Does str2 end with 'ing'? " + str2.endsWith("ing"));

        // 8. indexOf() and lastIndexOf()
        System.out.println("Index of 'o' in str1: " + str1.indexOf('o'));
        System.out.println("Last index of 'o' in str1: " + str1.lastIndexOf('o'));

        // 9. replace()
        System.out.println("Replace 'World' with 'Java': " + str1.replace("World", "Java"));

        // 10. trim()
        String str4 = "   spaced text   ";
        System.out.println("Before trim: '" + str4 + "'");
        System.out.println("After trim: '" + str4.trim() + "'");

        // 11. split()
        String str5 = "apple,banana,mango";
        String[] fruits = str5.split(",");
        System.out.println("Split fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 12. concat()
        System.out.println("Concatenation: " + str1.concat(" - ").concat(str2));
    }
}
