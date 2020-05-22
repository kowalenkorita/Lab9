import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

//Задана коллекция строк. Вернуть последний элемент и третий элемент коллекции.
public class Lab9_1 {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("a1", "a2", "a3");
        System.out.println(collection.stream().skip(collection.size() - 1).findAny().orElse("empty"));
        System.out.println(collection.stream().skip(2).findFirst().get());
    }
}
