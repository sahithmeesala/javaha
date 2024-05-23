import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStaticData {
    public static List<String> names = Arrays.asList("Sahith", "Mohan", "Bala");

    public static void main(String[] args) {
        List<String> filteredNames = names.stream()
            .filter(name -> name.length() > 4)
            .collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}
