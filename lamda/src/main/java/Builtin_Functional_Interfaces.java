import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Builtin_Functional_Interfaces {

  public static void main(String[] args) {

    Stream.generate(() -> new Random().nextInt())
        .limit(5)
        .forEach(System.out::println);


    Stream.generate(() -> new Random().nextInt())
        .limit(5)
        .forEach((e) -> System.out.println(e));

    //Supplier = fornece algo
    //Consumer - recebe um valor



//    List<Integer> list = Arrays.asList(1,2,3,4,5);

//    list.stream()

  }

}
