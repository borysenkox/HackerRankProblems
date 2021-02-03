package not.hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Convert int[] into Set<Integer> and vice versa using streams.
 */

public class Problem_2 {
    public static void main(String[] args) {
        int[] intArray = {1, 8, -5, 3, 10, 101, 7};

        Set<Integer> hashSet = Stream.of(1, 2, 3).collect(Collectors.toCollection(HashSet::new));

        System.out.println(arrayToSet(intArray));

        System.out.println(Arrays.toString(setToArray(hashSet)));
    }

    public static Set<Integer> arrayToSet(int[] array) {
        return Arrays.stream(array).boxed().collect(Collectors.toSet());
    }

    public static int[] setToArray(Set<Integer> set) {
        return set.stream().mapToInt(x -> x).toArray();
    }
}
