package coding.skill.chapter01.p14;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.RowFilter.Entry;

public class test {
  public static void main(String[] args) {

    Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("문자열을 입력하세요");
    String str = scanner.nextLine();

    System.out.println();

    scanner.close();
  }

  static Pair<Character, Integer> maxOccurenceCharacter(String str) {
    Map<Character, Integer> counter = new HashMap<>();
    char[] chStr = str.toCharArray();

    for (int i = 0; i < chStr.length; i++) {
      char currentCh = chStr[i];
      if (!Character.isWhitespace(currentCh)) {
        Integer noCh = counter.get(currentCh);
        if (noCh == null) {
          counter.put(currentCh, 1);
        } else {
          counter.put(currentCh, ++noCh);
        }
      }
    }

    int maxOccurences = Collections.max(counter.values());
    char maxCharacter = Character.MIN_VALUE;

    for (Entry<Character, Integer> entry : counter.entrySet()) {
      if (entry.getValue() == maxOccurences) {
        maxCharacter = entry.getKey();
      }
    }

    return Pair.of(maxCharacter, maxOccurences);
  }

}