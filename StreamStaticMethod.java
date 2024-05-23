import java.util.Arrays;
import java.util.List;

public class StreamStaticMethod {
    public static boolean isLongName(String name) {
        return name.length() > 3;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sahith", "Mohan", "Bala");

        names.stream()
            .filter(StaticMethodExample::isLongName)
            .forEach(System.out::println);
    }
}
