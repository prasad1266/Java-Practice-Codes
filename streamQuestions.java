import java.util.Arrays;
import java.util.*;

public class streamQuestions {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 50, 40, 80, 99, 70, 100);
        Integer max = list.stream().max((a, b) -> Integer.compare(a, b)).get();
        System.out.println("Maximum salary : " + max);

        Integer second = list.stream().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println("Second Highest Salary :" + second);

    }
}
