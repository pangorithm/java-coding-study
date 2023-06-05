package coding.skill.chapter01.p09;

import java.util.Scanner;

public class test {
  public static void main(String[] args) {

    StringBuilder result = new StringBuilder();

    Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("문자열들을 입력하세요. 빈 문자열 입력시 종료됩니다");
    String str = "";
    do {
      str = scanner.nextLine();
      result.append(str).append("+");
    } while (!str.equals(""));

    System.out.println(result);

    scanner.close();
  }
}
