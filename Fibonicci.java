
import java.util.*;

public class Fibonicci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = input.nextInt(); // asking the no of terms

        int[] series = new int[n];
        // declaring array

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                series[0] = 0;
            }
            if (i == 1) {
                series[1] = 1;
            }
            if (i > 1) {
                series[i] = series[i - 1] + series[i - 2];
            }
        }
        System.out.println("The series are " + Arrays.toString(series));
    }
}
