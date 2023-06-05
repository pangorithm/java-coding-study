package coding.skill.chapter01.p07;

import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("숫자로 이루어진 문자열을 입력하세요");
    String str = scanner.nextLine();

    if (!str.contains(".")) {
      int toInt = Integer.parseInt(str);
      long toLong = Long.parseLong(str);
      float toFloat = Float.parseFloat(str);
      double toDouble = Double.parseDouble(str);

      Integer toIntObj = Integer.parseInt(str);
      Long toLongObj = Long.parseLong(str);
      Float toFloatObj = Float.parseFloat(str);
      Double toDoubleObj = Double.parseDouble(str);

      System.out.printf("%d, %d, %f, %f", toInt, toLong, toFloat, toDouble);
      System.out.printf("%d, %d, %f, %f", toIntObj, toLongObj, toFloatObj, toDoubleObj);
    } else {
      float toFloat = Float.parseFloat(str);
      double toDouble = Double.parseDouble(str);

      Float toFloatObj = Float.parseFloat(str);
      Double toDoubleObj = Double.parseDouble(str);

      System.out.printf("%f, %f", toFloat, toDouble);
      System.out.printf("%f, %f", toFloatObj, toDoubleObj);
    }
    ;

    scanner.close();
  }
}
