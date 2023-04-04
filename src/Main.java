import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        // String operations
        System.out.println("------ String Operations ------");
        System.out.println("Length of string 1: " + str1.length());
        System.out.println("Length of string 2: " + str2.length());
        System.out.println("Comparison using equals(): " + str1.equals(str2));
        System.out.println("Comparison using compareTo(): " + str1.compareTo(str2));
        System.out.println("Comparison using compareToIgnoreCase(): " + str1.compareToIgnoreCase(str2));

        String str3 = str1.concat(str2);
        System.out.println("Concatenation of string 1 and 2: " + str3);

        System.out.println("String 1 after replacing OGO/AGA with **: " + replaceOgoAga(str1));
        System.out.println("Number of words in string 2 starting with 'o': " + countWordsStartingWithO(str2));

        // StringBuilder operations
        System.out.println("------ StringBuilder Operations ------");
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);

        System.out.println("Length of StringBuilder 1: " + sb1.length());
        System.out.println("Length of StringBuilder 2: " + sb2.length());
        System.out.println("Comparison using equals(): " + sb1.equals(sb2));
        System.out.println("Comparison using compareTo(): " + sb1.compareTo(sb2));
        System.out.println("Comparison using compareToIgnoreCase(): " + sb1.toString().compareToIgnoreCase(sb2.toString()));

        StringBuilder sb3 = sb1.append(sb2);
        System.out.println("Concatenation of StringBuilder 1 and 2: " + sb3);

        System.out.println("StringBuilder 1 after replacing OGO/AGA with **: " + replaceOgoAga(sb1));
        System.out.println("Number of words in StringBuilder 2 starting with 'o': " + countWordsStartingWithO(sb2));
    }

    public static String replaceOgoAga(String str) {
        return str.replaceAll("(OGO|AGA)", "**");
    }

    public static StringBuilder replaceOgoAga(StringBuilder sb) {
        String str = sb.toString();
        str = replaceOgoAga(str);
        sb.setLength(0);
        sb.append(str);
        return sb;
    }

    public static int countWordsStartingWithO(String str) {
        String[] words = str.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (word.toLowerCase().startsWith("o")) {
                count++;
            }
        }
        return count;
    }

    public static int countWordsStartingWithO(StringBuilder sb) {
        String str = sb.toString();
        return countWordsStartingWithO(str);
    }
}
