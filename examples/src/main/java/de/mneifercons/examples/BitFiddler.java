/*
 * Copyright (c) 2020 Markus Neifer
 * Licensed under the MIT License.
 * See file LICENSE in parent directory of project root.
 */
package de.mneifercons.examples;

/**
 * Bit fiddler.
 */
final class BitFiddler {

  private BitFiddler() {
  }

  /**
   * Application entry point.
   *
   * @param args the application arguments
   */
  public static void main(final String[] args) {
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
