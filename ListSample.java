import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ListSample {
    public static void main(String[] args) {
	List<String> stringList = new ArrayList<>();
	stringList.add("foo");
	stringList.add("bar");
	stringList.add("baz");

	System.out.println(stringList.size());

	System.out.println(stringList.get(0));
	System.out.println(stringList.get(2));

	System.out.println(stringList.indexOf("bar"));

	List<String> subList = stringList.subList(0, 2);

 	for (String s : subList) {
	    System.out.println(s);
	}
	subList.set(1, "baz");

 	for (String s : subList) {
	    System.out.println(s);
	}
    }
}
