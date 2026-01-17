import java.util.ArrayList;
import java.util.Collections;

class MinandMax {

    public static ArrayList<Integer> findMinMax(int[] arr) {
        ArrayList<Integer> sortedArr = new ArrayList<>();
        for (int num : arr) {
            sortedArr.add(num);
        }
        // sort arraylist
        Collections.sort(sortedArr);

        ArrayList<Integer> result = new ArrayList<>();
        result.add(sortedArr.get(0));
        result.add(sortedArr.get(sortedArr.size() - 1));
        return result;
    }

    public static void main(String[] args) {

        int[] arr = { 3, 5, 4, 1, 9 };
        ArrayList<Integer> result = findMinMax(arr);
        System.out.println("MIN " + result.get(0) + " " + "MAX " + result.get(1));

    }

}