public class BitFiddler {
  public static void main(String[] args) {
    if (args.length > 0) {
      int i = 0;
      int noOfBytes = args.length;
      byte[] bytes = new byte[noOfBytes];

      for (i = 0; i < noOfBytes; ++i) {
        bytes[i] = Byte.parseByte(args[0], 2);
      }
      String string = new String(bytes);
      System.out.println(string);
    }
  }
}
