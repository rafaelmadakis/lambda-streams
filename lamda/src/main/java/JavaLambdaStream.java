import java.util.Arrays;
import java.util.List;

public class JavaLambdaStream {

  public static void main(String[] args) {

    //API de STREAM

    //stream - fluxo de dados

    List<Integer> asList = Arrays.asList(1,2,3,4);
    asList.stream()
        .filter(e -> e % 2 == 0)
        .forEach(e -> System.out.println(e));
  }

}
