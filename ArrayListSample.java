import java.util.Arrays;
import java.util.List;

public class ArrayListSample {
    public static void main(String[] args) {
	String[] a = {"foo", "bar"};
	List<String> l = Arrays.asList(a);
	l.add("baz");
	System.out.println(l.get(0));
	System.out.println(l.get(1));
    }
}
