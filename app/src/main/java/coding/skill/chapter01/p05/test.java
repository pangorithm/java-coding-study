package coding.skill.chapter01.p05;

import java.util.Scanner;

public class test {

  static int vowels = 0;
  static int consonants = 0;

  public static void main(String[] args) {
    Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("문자열을 입력하세요");
    String str = scanner.nextLine();
    countVowelsAndCononants(str);
    System.out.printf("모음: %d개, 자음: %d개", vowels, consonants);

    scanner.close();
  }

  public static void countVowelsAndCononants(String str) {
    str = str.toLowerCase();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      switch (ch) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
          vowels++;
          break;
        default:
          if (ch >= 'a' && ch <= 'z') {
            consonants++;
          }
          break;
      }
    }
  }
}
