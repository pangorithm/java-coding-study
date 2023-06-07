package coding.skill.chapter01.p11;

import java.util.Scanner;

public class test {
  public static void main(String[] args) {

    Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("문자열을 입력하세요");
    System.out.println(isPalindrome(scanner.nextLine()) ? "true" : "false");

    scanner.close();
  }

  public static boolean isPalindrome(String str) {
    int n = str.length();

    for (int i = 0; i < n / 2; i++) {
      if (str.charAt(i) != str.charAt(n - i - 1)) {
        return false;
      }
    }
    return true;
  }
}