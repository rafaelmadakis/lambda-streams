import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaStreams {

  public static void main(String[] args) {

    List<Integer> lista = Arrays.asList(1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9);

    //Até Java 4
//   for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
//     Integer integer = (Integer) iterator.next();
//     System.out.println(integer);
//   }
//
//    System.out.println();

    // Java 5
//    for (Integer integer: lista) {
//      System.out.println(integer);
//    }
//    System.out.println();

    //STREAMS
    String collect = lista.stream()
        .map(e -> String.valueOf(e))
//        .filter(e -> e % 2 == 0)
//        .map(e -> e * 3)
//            .collect(Collectors.toList());
//        .collect(Collectors.groupingBy(e -> e % 2 == 0));
//    .collect(Collectors.groupingBy(e -> e % 2 == 0));
//    .collect(Collectors.joining());
        .collect(Collectors.joining(";"));
//        .min(Comparator.naturalOrder());
//        .max(Comparator.naturalOrder());
//        .count();
//        .limit(12)//operação intermediária
//        .map(e  -> e * 2)
//        .skip(2)
//        .distinct() // equals and hasCode
//        .filter(e -> e % 2 == 0)
//        .forEach(e -> System.out.println(e));

    System.out.println(collect);


  }

}
