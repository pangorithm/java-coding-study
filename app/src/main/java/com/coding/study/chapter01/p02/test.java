package com.coding.study.chapter01.p02;

import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("문자열을 입력하세요");
    String str = scanner.nextLine();

    // 입력된 문자열에서 처음으로 중복되지 않는 문자 출력
    System.out.printf("%c\n", firstNonRepeatedCharacter(str));

    scanner.close();
  }

  private static final int EXTENDED_ASCII_CODE = 256;

  static char firstNonRepeatedCharacter(String str) {
    int[] flags = new int[EXTENDED_ASCII_CODE];

    for (int i = 0; i < flags.length; i++) {
      // 아스키코드 테이블 배열 생성
      flags[i] = -1;
      // 각 아스키코드에 -1을 입력하여 아직 해당 문자가 나타나나지 않았음을 표기
    }

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (flags[ch] == -1) { // 해당 문자를 처음 만났을 경우
        flags[ch] = i;
        // 아스키번호 순서 배열에 해당 문자의 문자열에서의 순서 입력
      } else { // 해당 문자를 처음 만나지 않았을 경우
        flags[ch] = -2; // 이미 확인한(중복된) 문자임일 경우 표기
      }
    }

    int position = Integer.MAX_VALUE; // 정수로 표현 가능한 최대값

    for (int i = 0; i < EXTENDED_ASCII_CODE; i++) {
      if (flags[i] >= 0) {
        // 아스키코드에 해당되는 문자가 중복되지 않은 문자일 경우 해당 문자열에서의 순서 입력
        // 아스키코드 순서대로 순회하다가 문자열 순서가 먼저인 중복되지 않은 문자가 있을 경우
        // 해당 문자를 position에 할당
        position = Math.min(position, flags[i]);
      }
    }

    // 중복되지 않는 문자가 있어 position에 해당 문자가 할당되었을 경우
    // 문자열에서 해당 문자를 반환
    return position == Integer.MAX_VALUE ? Character.MIN_VALUE : str.charAt(position);
  }
}