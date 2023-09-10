import java.util.Scanner;
import static java.lang.Math.sqrt;

public class ReverseRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] reverseRoot = new double[256 * 1000];
        int arraySize = 0;
        while (sc.hasNextLong()) {
            reverseRoot[arraySize++] = sqrt(sc.nextLong());
        }
        for (int i = (arraySize - 1); i >= 0; i--) {
            System.out.printf("%4f\n", reverseRoot[i]);
        }
        sc.close();
    }
}
