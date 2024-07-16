package days03;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2024. 7. 3. - 오후 4:30:05
 * @subject 쌤이 쓴거
 * @content
 *
 */
public class Ex05_te {

   public static void main(String[] args) {
      /* 대입연산자 =
      int x = 100;
      int y = x;
      */

      // [부호연산자]
      // +3      -3
      // int x = +3 + 4;

      // -3*-1

      // [증감연산자]
      // [쉬프트연산자]
      // [복합대입연산자]
      // [삼항연산자 == 조건연산자]
      // [instanceof 비교연산자] X

      // 우선순위 기억 : & > ^ > | >  &&   > ||
      // 3 + 4 + 5 + 7          ->
      /*
      int x = 10;
      int y = 10;
      int z = 10;

      int x = 10, y = 10, z = 10;

      int x, y, z;
      // <-----
      x=y=z=10;
        */
      // p87
      /*
      int apple = 1;
      double pieceUit = 0.1;
      int number = 7;
      //                 1 - 7 * 0.1
      double result = apple - number * pieceUit;
      System.out.println("사과 1개에서 남은 양 : " + result);
      */

      // (암기)
      // 두 문자열을 비교할 때는  ==      != 비교 연산자를 사용하지 말라.
      //                         equals()  !equals()
      String n1 = "kenik", n2;

      Scanner scanner = new Scanner(System.in);

      System.out.print("> n2 입력 ? ");
      n2 = scanner.next();

      System.out.println( n1 == n2 );  // false
      System.out.println( n1.equals(n2) ); // true
      System.out.println( n1.equalsIgnoreCase(n2) ); // true
/*
      System.out.println( n1 != n2 );  // false
      System.out.println( !n1.equals(n2) ); // true
*/
   }

}


/*
// 0000 0011
System.out.println(  3  );
System.out.println( Integer.toBinaryString(3) );
String binStr = Integer.toBinaryString(3);
System.out.printf("%08d\n", Integer.parseInt( binStr )  ); // "11" -> 11 형변환

//int no = 15;
//System.out.printf("%08d\n", no);
*/
