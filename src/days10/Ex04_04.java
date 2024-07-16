package days10;

import java.util.Arrays;

/**
 * @author JUNYONG
 * @Date 2024. 7. 12.=오후 3:04:22
 * @subject
 * @content
 *
 */
public class Ex04_04 {

	public static void main(String[] args) {
		
		int [] m = new int[8];
		m[0]=1;m[1]=2;m[2]=3;m[3]=4;m[4]=5;m[5]=6;
		System.out.println(Arrays.toString(m));
		int deleteIndex = 2;
		int index = 6;//추가될 때 가르키고있는 위치 (전학생 올자리)
		for (int i = deleteIndex+1; i < index; i++) {
			m[i-1] = m[i];
		}
		m[index-1] =0; // 마지막
		index--;
		System.out.println(Arrays.toString(m));
		
	
		int [] n = {0,1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(n)); //인덱스 3번 (3)을 삭제해보자
		int delete = 3;
		int last = 7;
		for (int i = delete+1; i < n.length; i++) {
			n[i-1]=n[i];
		}
		System.out.println(Arrays.toString(n)); //맨 마지막 7이 남아있게 됨
		n[last] = 0;
		System.out.println(Arrays.toString(n)); //마지막 비우기
	}//main

}//class
