import java.util.ArrayList;
import java.util.List;

public class AlternateElements {
    public static List<Integer> getAlternateElements(int[] arr) {
        List<Integer> result = new ArrayList<>();
 // Iterate over all alternate elements
        for (int i = 0; i < arr.length; i += 2) {
            result.add(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        System.out.println(getAlternateElements(arr));
    }
}
