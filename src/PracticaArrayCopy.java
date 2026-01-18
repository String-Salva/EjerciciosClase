import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PracticaArrayCopy {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6 };

    Arrays.stream(nums)
        .filter(n -> n % 2 == 0)
        .map(n -> n + 1);

    Set<Integer> ejemplo = new HashSet<>();

    ejemplo.add(4);
    ejemplo.add(5);
    ejemplo.add(6);
    ejemplo.add(7);
    ejemplo.add(1);
    ejemplo.add(9);

    System.out.println(ejemplo);
    ejemplo.clear();

  }
}
