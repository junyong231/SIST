package days19;

import java.util.ArrayList;

/**
 * @author kenik
 * @date 2024. 7. 25. - 오전 6:57:54
 * @subject
 * @content
 *
 */
public class Ex00_02 {

   public static void main(String[] args) {
      solution("abc1Addfggg4556b",   6);
   } // main

   public static ArrayList solution(String my_str, int n) {
      ArrayList list = new ArrayList();

      int i = 0;
      String str = null;
      try {
         while(true) {
            str = my_str.substring(i*n, (i+1)*n);
            System.out.println(i + " : " + str);
            list.add(str);
            i++;
         } // while
      } catch (StringIndexOutOfBoundsException e) {
         str = my_str.substring(i*n);
         System.out.println(i + " : " + str);
         list.add(str);
      }

        // ArrayList -> String [] 변환
    
      
      
        return list;
    }


} // class\

