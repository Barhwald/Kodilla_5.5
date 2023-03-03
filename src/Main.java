import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(findNumbers(3, 15, 33));

    }

    public static List<Integer> findNumbers(int x, int a, int b) {

        List<Integer> results = new ArrayList<>();

        for (int i = a; i <= b; i++) {
            if (i % x == 0) {
                results.add(i);
            }
        }

        return results;

    }
}
