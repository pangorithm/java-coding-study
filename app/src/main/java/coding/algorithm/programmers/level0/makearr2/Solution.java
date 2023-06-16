package coding.algorithm.programmers.level0.makearr2;

class Solution {
  public int[] solution(int l, int r) {
    char[] startch = Integer.toString(l).toCharArray();
    char[] endch = Integer.toString(r).toCharArray();
    String startbstr = String.valueOf(barr0(startch));
    String endbstr = String.valueOf(barr1(endch));
    int start = Integer.parseInt(startbstr, 2);
    int end = Integer.parseInt(endbstr, 2);
    if (start > end) {
      int[] answer = { -1 };
      return answer;
    }
    int[] intarr = new int[end - start + 1];
    for (int i = 0; i < intarr.length; i++) {
      intarr[i] = Integer.parseInt(Integer.toString((start + i), 2).replaceAll("1", "5"));
    }

    return intarr;
  }

  char[] barr0(char[] arr) {
    char[] temp = new char[arr.length + 1];
    for (int i = 0; i < temp.length; i++) {
      temp[i] = '0';
    }
    for (int i = 1; i < temp.length; i++) {
      if (arr[i - 1] == '5') {
        temp[i] = '1';
      } else if (arr[i - 1] > '5') {
        temp[i - 1] = '1';
        break;
      } else {
        temp[i] = '1';
        break;
      }
    }
    return temp;
  }

  char[] barr1(char[] arr) {
    char[] temp = new char[arr.length + 1];
    for (int i = 0; i < temp.length; i++) {
      temp[i] = '0';
    }
    loop: for (int i = 1; i < temp.length; i++) {
      if (arr[i - 1] == '5') {
        temp[i] = '1';
      } else if (arr[i - 1] > '5') {
        for (; i < temp.length; i++) {
          temp[i] = '1';
        }
        break loop;
      } else {
        i++;
        for (; i < temp.length; i++) {
          temp[i] = '1';
        }
        break;
      }
    }
    return temp;
  }
}