package coding.skill.chapter01.p10;

import java.util.Scanner;

public class test {
  public static void main(String[] args) {

    Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("문자열을 입력하세요");

    permuteAndPrint(scanner.nextLine());

    scanner.close();
  }

  public static void permuteAndPrint(String str) {
    permuteAndPrint(" ", str);
  }

  public static void permuteAndPrint(String prefix, String str) {
    int n = str.length();

    if (n == 0) {
      System.out.print(prefix + " ");
    } else {
      for (int i = 0; i < n; i++) {
        permuteAndPrint(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i));
      }
    }
  }
}