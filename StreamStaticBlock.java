import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStaticBlock {
    public static List<String> names;

    static {
        names = new ArrayList<>();
        names.add("Sahith");
        names.add("Bala");
        names.add("Mohan");
    }

    public static void main(String[] args) {
        List<String> longNames = names.stream()
            .filter(name -> name.length() > 4)
            .collect(Collectors.toList());
        System.out.println("Names longer than 4 characters: " + longNames);
    }
}
