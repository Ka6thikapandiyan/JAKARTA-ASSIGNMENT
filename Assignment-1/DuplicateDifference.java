import java.util.Scanner;

public class DuplicateDifference {

    public static int findDuplicateDifference(int[] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j]) {
                    return j - i;
                }
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int   n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();   

        }
        int difference = findDuplicateDifference(A);
        System.out.println(difference);
    }
}