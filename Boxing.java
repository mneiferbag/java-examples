import java.util.List;
import java.util.AbstractList;

public class Boxing {
  public static void main(String[] args) {
    for (int i : asList(new int[] { 0, 1, 2 })) {
      System.out.println(i);
    }
  }

  // List adapter for primitive int array
  public static List<Integer> asList(final int[] a) {
     return new AbstractList<Integer>() {
        public Integer get(int i) { return a[i]; }
        // Throws NullPointerException if val == null
        public Integer set(int i, Integer val) {
            Integer oldVal = a[i];
            a[i] = val;
            return oldVal;
        }
        public int size() { return a.length; }
    };
  }

}
