package coding.skill.chapter01.p04;

import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("문자열을 입력하세요");
    String str = scanner.nextLine();
    if (containsOnlyDigits(str)) {
      System.out.println("숫자로만 이루여져 있습니다");

    } else {
      System.out.println("숫자로만 이루어져 있지 않습니다");
    }

    scanner.close();

  }

  public static boolean containsOnlyDigits(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (!Character.isDigit(str.charAt(i))) {
        return false;
      }
    }
    return true;
  }
}
