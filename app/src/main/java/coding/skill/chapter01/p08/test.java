package coding.skill.chapter01.p08;

import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("공백 제거할 문자열 입력");
    String str = scanner.nextLine();

    System.out.println(str.replaceAll(" ", "")); // " "대신 \\s 사용 가능

    scanner.close();
  }
}
