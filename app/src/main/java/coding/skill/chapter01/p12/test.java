package coding.skill.chapter01.p12;

import java.util.Scanner;

public class test {
  public static void main(String[] args) {

    Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("문자열을 입력하세요");
    System.out.println(removeDuplicates(scanner.nextLine()));

    scanner.close();
  }

  public static String removeDuplicates(String str) {
    char[] chArray = str.toCharArray();
    StringBuilder sb = new StringBuilder();

    for (char ch : chArray) {
      if (sb.indexOf(String.valueOf(ch)) == -1) {
        sb.append(ch);
      }
    }
    return sb.toString();
  }

}