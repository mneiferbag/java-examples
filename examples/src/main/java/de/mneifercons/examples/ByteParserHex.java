/*
 * Copyright (c) 2020 Markus Neifer
 * Licensed under the MIT License.
 * See file LICENSE in parent directory of project root.
 */
package de.mneifercons.examples;

public class ByteParserHex {
  public static void main(String[] args) {
    byte[] bytes = new byte[args.length];

    for (int i = 0; i < args.length; ++i) {
        bytes[i] = Byte.parseByte(args[i], 16);
    }
    System.out.println(new String(bytes));
  }
}