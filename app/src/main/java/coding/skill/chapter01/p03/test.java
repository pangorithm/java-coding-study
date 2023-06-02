package coding.skill.chapter01.p03;

import java.util.Scanner;

// 단어 순서는 바꾸지 않고 각 단어의 글자 순서만 역순으로 만들기
public class test {

  private static final String WHITESPACE = " ";

  public static void main(String[] args) {
    Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("문자열을 입력하세요");
    String str = scanner.nextLine();

    System.out.println(reverseWords(str));

    scanner.close();
  }

  static String reverseWords(String str) {
    // 문자열을 각 단어별로 분리
    String[] words = str.split(WHITESPACE);
    // 단어 순서는 그대로이면서 단어의 글자만 역순인 문자열 변수 생성
    StringBuilder reversedString = new StringBuilder();

    for (String word : words) {
      // 역순인 단어 변수 설정
      StringBuilder reverseword = new StringBuilder();

      for (int i = word.length() - 1; i >= 0; i--) {
        // 단어를 뒤에서부터 앞으로 순회하며 역순인 단어 생성
        reverseword.append(word.charAt(i));
      }

      // 역순인 단어들로 만들어진 문자열 생성
      reversedString.append(reverseword).append(WHITESPACE);
    }

    return reversedString.toString();
  }
}
