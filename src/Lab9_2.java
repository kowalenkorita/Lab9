import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

//Задана коллекция строк. Отсортировать значения по алфавиту и убрать повторы.
public class Lab9_2 {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("a1", "a4", "a3", "a2", "a1", "a4");
        System.out.println(collection.stream().sorted().distinct().collect(Collectors.toList()));
    }
}
