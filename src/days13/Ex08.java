package days13;

/**
 * @author JUNYONG
 * @Date 2024. 7. 17.=오후 3:42:03
 * @subject	static키워드
 * @content
 *
 */
public class Ex08 {

	public static void main(String[] args) {
		//이게 5000명이면 어쩔 => 클래스 배열
		/*
		Save s1 = new Save("김선우" , 1000 , 0.03);
		Save s2 = new Save("김인경" , 10000 , 0.03);
		Save s3 = new Save("김재민" , 5000 , 0.03);
		Save s4 = new Save("김준석" , 15000 , 0.03);
		Save s5 = new Save("박준용" , 1000 , 0.03);

		s1.dispSave();
		s2.dispSave();
		s3.dispSave();
		s4.dispSave();
		s5.dispSave();
		 */

		//클래스 배열
		/*
		Save [] sArr = new Save[5]; //이것만으론 아직 객체 생성 전
		sArr[0] = new Save("김선우" , 1000 , 0.03);
		sArr[1] = new Save("김인경" , 10000 , 0.03);
		sArr[2]= new Save("김재민" , 5000 , 0.03);
		sArr[3] = new Save("김준석" , 15000 , 0.03);
		sArr[4] = new Save("박준용" , 1000 , 0.03);

		for (int  i = 0; i < sArr.length; i++) {
			sArr[i].dispSave();
		}
		 */

		// 클래스 변수 접근 
		// 클래스명.클래스변수	
		//System.out.println(Save.rate);
		//rate를 프라이빗에서 퍼블릭으로 바꾸지 않으면 접근할 수 없다.
		Save.setRate(0.05);
		// static ==객체 생성 안해도 일단 메모리에 올림!!!!!!!!!!!!!!!!

		//클래스배열 초기화
		Save [] sArr = {
				new Save("김선우" , 1000 , 0.03),
				new Save("김인경" , 10000 , 0.03),
				new Save("김재민" , 5000 , 0.03), 
				new Save("김준석" , 15000 , 0.03),
				new Save("박준용" , 1000 , 0.03)
		};
		
		//sArr[2].setRate(0.07); //객체로도 접근 가능함
		// + 여기는 이미 인스턴스가 생성된 이후라서 게터 세터 가능
		
		Save.setRate(0.05);
		
		for (int  i = 0; i < sArr.length; i++) {
			sArr[i].dispSave();
		}
		
		
	}//main

	
}//class
