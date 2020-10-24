/*
 * Copyright (c) 2020 Markus Neifer
 * Licensed under the MIT License.
 * See file LICENSE in parent directory of project root.
 */
package de.mneifercons.examples;

/**
 * Byte parser.
 */
final class ByteParserHex {

  /**
   * The radix for parsing.
   */
  private static final int RADIX = 16;

  private ByteParserHex() {
  }

  /**
   * Application entry point.
   *
   * @param args the application arguments
   */
  public static void main(final String[] args) {
    byte[] bytes = new byte[args.length];

    for (int i = 0; i < args.length; ++i) {
      bytes[i] = Byte.parseByte(args[i], RADIX);
    }
    System.out.println(new String(bytes));
  }
}
