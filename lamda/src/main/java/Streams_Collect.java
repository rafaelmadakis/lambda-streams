import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Streams_Collect {

  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

    List<Integer> collect = list.stream()
        .collect(() -> new ArrayList<>()
            , (l, e) -> l.add(e),
            (l1, l2) -> l1.addAll(l2));

    System.out.println(list);
    System.out.println(collect);

    // toList
    List<Integer> collect2 = list.stream()
        .filter((n) -> n % 2 == 0)
        .collect(Collectors.toList());

    System.out.println(collect2);

    // toSet
    Set<Integer> collect3 = list.stream()
        .filter((n) -> n % 2 == 0)
        .collect(Collectors.toSet());

    System.out.println(collect3);

    //toCollections
    Set<Integer> collect4 = list.stream()
        .filter((n) -> n % 2 == 0)
        .collect(Collectors.toCollection(() -> new TreeSet<>()));

    System.out.println(collect4);

    // joinning
    String join = list.stream()
        .map(n -> n.toString())
        .collect(Collectors.joining());
    System.out.println(join);

    // joinning com delimitador
    String join1 = list.stream()
        .map(n -> n.toString())
        .collect(Collectors.joining(";"));
    System.out.println(join1);

    // media
    Double media = list.stream()
        .collect(Collectors.averagingInt(n -> n.intValue()));
    System.out.println(media);

    //sumarizar
    IntSummaryStatistics stats = list.stream()
        .collect(Collectors.summarizingInt(n -> n.intValue()));
    System.out.println(stats);

    //counting
    Long count = list.stream()
        .filter((n) -> n % 2 == 0)
        .collect(Collectors.counting());
    System.out.println(count);

    list.stream()
        .filter((n) -> n % 2 == 0)
        .collect(Collectors.maxBy(Comparator.naturalOrder()))
        .ifPresent(System.out::println);

    list.stream()
        .filter((n) -> n % 2 == 0)
        .collect(Collectors.minBy(Comparator.naturalOrder()))
        .ifPresent(System.out::println);

    //grouping by
    Map<Integer, List<Integer>> grouping = list.stream()
        .collect(Collectors.groupingBy((n) -> n % 3));
    System.out.println(grouping);

    //partitioning by
    Map<Boolean, List<Integer>> partitioning = list.stream()
        .collect(Collectors.partitioningBy((n) -> n % 3 == 0));
    System.out.println(partitioning);

    //toMap
    Map<Integer, Double> toMap = list.stream()
        .collect(Collectors.toMap(n -> n, n -> Math.pow(n.doubleValue(), 5)));
    System.out.println(toMap);

  }

}
