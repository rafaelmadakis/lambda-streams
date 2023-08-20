import java.util.OptionalInt;
import java.util.stream.Stream;

public class Optional {

  public static void main(String[] args) {

//    String s = "Inscreva-se";
    String s = "1";
//   converteEmNumero(s).ifPresent(n -> System.out.println(n));
//    Integer numero = converteEmNumero(s).orElse(2);
//    Integer numero = converteEmNumero(s).orElseGet(() -> 5);
    int numero = converteEmNumero(s).orElseThrow(() -> new NullPointerException("Valor vazio"));
    System.out.println(numero);

//   Stream.of(1,2,3)
//        .findFirst()
//       .ifPresent(n -> System.out.println(n));
  }

  public static java.util.OptionalInt converteEmNumero(String numeroStr) {

    try {
      Integer integer = Integer.parseInt(numeroStr);
      return OptionalInt.of(integer);
    } catch (Exception s) {
      return OptionalInt.empty();
    }

  }

}
