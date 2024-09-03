import java.util.Scanner;
public class ContinuousCharacterCount {
    public static int countContinuousCharacters(String s) {
        int count = 0;
        char currentChar = '\0';
        int currentCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char charAtI = s.charAt(i);
            if (charAtI == currentChar) {
                currentCount++;
                if (currentCount == 3) {
                    count++;
                }
            } else {
                currentChar = charAtI;
                currentCount = 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int result = countContinuousCharacters(s);
        System.out.println(result);
        scanner.close();
    }
}
