package com.coding.study.chapter01.p01countDuplicateCharacter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("문자열을 입력하세요");
    String str = scanner.nextLine();
    Map<Character, Integer> countresult = countDuplicateCharacters(str);

    System.out.println("문자열의 각 문자의 개수");
    countresult.forEach((key, value) -> System.out.printf("%c : %d\n", key, value));

    scanner.close();
  }

  static Map<Character, Integer> countDuplicateCharacters(String str) {
    Map<Character, Integer> result = new HashMap<>();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      result.compute(ch, (key, value) -> (value == null) ? 1 : ++value);
    }

    return result;
  }
}
