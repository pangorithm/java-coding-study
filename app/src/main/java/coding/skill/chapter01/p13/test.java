package coding.skill.chapter01.p13;

import java.util.Scanner;

public class test {
  public static void main(String[] args) {

    Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("문자열을 입력하세요");
    String str = scanner.nextLine();
    System.out.println("필터링할 문자를 입력하세요");
    String ch = scanner.nextLine();
    System.out.println(str.replace(ch, ""));

    scanner.close();
  }

}