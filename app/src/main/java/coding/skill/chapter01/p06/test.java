package coding.skill.chapter01.p06;

import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("문자열을 입력하세요");
    String str = scanner.nextLine();

    System.out.println("필터링할 문자를 입력하세요");
    String character = scanner.next();
    char ch = character.charAt(0);
    scanner.nextLine();

    System.out.printf("해당 문자의 빈도수: %d\n",
        (str.length() - str.replace(String.valueOf(ch), "").length()));

    scanner.close();
  }
}