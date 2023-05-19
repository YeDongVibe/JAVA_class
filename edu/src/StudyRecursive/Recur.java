package StudyRecursive;

//재귀에 대한 이해를 돕는 순수 재귀 메서드

import java.util.Scanner;

class Recur {

 static final String indent = "__";
 static final int indentBase = 5;

 //--- 순수 재귀 메서드 ---//
 static void recur(int n) {
     System.out.println(indent.repeat(indentBase - n) + "recur(" + n + ") 진입");
     if (n > 0) {
         
         recur(n - 1);
         System.out.println(indent.repeat(indentBase - n) + "n = " + n);
         recur(n - 2);
     }
     System.out.println(indent.repeat(indentBase - n) + "recur(" + n + ") 종료");
 }

 public static void main(String[] args) {
     Scanner stdIn = new Scanner(System.in);

     System.out.print("정수를 입력하세요 : ");
     int x = stdIn.nextInt();

     recur(x);
 }
}