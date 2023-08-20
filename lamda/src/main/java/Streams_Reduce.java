import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Streams_Reduce {

  public static void main(String[] args) {

    String s = "Increva-se e compartilhe esse video";
    String[] split = s.split(" ");
    List<String> listStr = Arrays.asList(split);

     List<Integer> list = Arrays.asList(1,2,3,4,5,6);

     Optional<Integer> reduceSoma = list.stream()
         .reduce((n1, n2) -> n1 + n2);
    System.out.println(reduceSoma.get());


    Optional<Integer> reduceMultiplicacao = list.stream()
        .reduce((n1, n2) -> n1 * n2);
    System.out.println(reduceMultiplicacao.get());

    Optional<String> reduceConcatenando = listStr.stream()
        .reduce((s1, s2) ->  s1.concat(s2));
    System.out.println(reduceConcatenando.get());

    // não deve ser utilizado reduce com subtração
    Optional<Integer> reduceSubtracao = list.stream()
        .reduce((n1, n2) -> n1 - n2);
    System.out.println(reduceSubtracao.get());



    List<Integer> listVazia = Arrays.asList();


    // Identidade precisa ser igual ao n2
    Integer reduceSoma2 = listVazia.stream()
        .reduce(0, (n1, n2) -> n1 + n2);
    System.out.println(reduceSoma2);


    Integer reduceMultiplicacao2 = list.stream()
        .reduce(1,(n1, n2) -> n1 * n2);
    System.out.println(reduceMultiplicacao2);

    String reduceConcatenando2 = listStr.stream()
        .reduce("", (s1, s2) ->  s1.concat(s2));
    System.out.println(reduceConcatenando2);

    // reduce - menor valor

    Double menorValor = DoubleStream.of(1.5, 2.9, 6.7)
        .reduce(Double.POSITIVE_INFINITY, (d1, d2) -> Math.min(d1,d2));
    System.out.println(menorValor);

    // reduce combinação
    Integer reduceCombinacaoSoma3 = list.stream()
        .reduce(0,(n1, n2) -> n1 + n2, (n1 , n2) -> n1 + n2);
    System.out.println(reduceCombinacaoSoma3);

    // reduce - map + combiner
    String  reduce = list.stream()
        .map(n1 -> n1.toString())
        .reduce("",
            (n1, n2) -> n1.toString().concat(n2.toString()),
            (n1, n2) -> n1.concat(n2));
    System.out.println(reduce);



  }




}
