import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Collections {

  public static void main(String[] args) {

    // List
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    list.forEach(n -> System.out.println(n));
    list.removeIf(n -> n % 2 == 0);
    list.forEach(n -> System.out.println(n));
    list.replaceAll(n -> n * 2);
    list.forEach(n -> System.out.println(n));

    //map
    HashMap<Integer, String> map = new HashMap<>();
    map.put(0, "Se");
    map.put(1, "Inscreva");
    map.put(2, "no");
    map.put(3, "canal");

    map.forEach((k, v) -> System.out.println(k + v));

    //compute
    map.compute(1,(k,v) -> v + " agora");
    map.forEach((k,v) -> System.out.println(k + v));


    map.merge(3, "!", (v1, v2) -> v1 + v2);
    map.forEach((k,v) -> System.out.println(k + v));


    //replaceAll
    map.replaceAll((k,v) -> v + "!");
    map.forEach((k,v) -> System.out.println(k + v));



  }

}
