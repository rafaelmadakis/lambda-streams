import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams_Creation {

  public static void main(String[] args) throws FileNotFoundException {

    //Collection
    List<Integer> list = Arrays.asList(1, 2, 3, 4);

    list.stream()
        .forEach(System.out::println);

    //Arrays
    Integer[] intArray = new Integer[]{1, 2, 3, 4};
    Arrays.stream(intArray)
        .forEach(System.out::println);

    // Stream.of
    Stream.of("Se", "inscreva")
        .forEach(System.out::println);

    // InStream.range

    IntStream.range(0, 5)
        .forEach(System.out::println);

    IntStream.rangeClosed(0, 5)
        .forEach(System.out::println);

    //Stream iterate

    Stream.iterate(5, n -> n * 2)
        .limit(10)
        .forEach(System.out::println);

    // BefferedReader
    File file = new File("/Users/rafaelmadakis/Documents/lambda-streams/lamda/streams.txt");
    FileReader in = new FileReader(file);
    BufferedReader br = new BufferedReader(in);
    br.lines()
        .forEach(System.out::println);


    //file


  }

}
