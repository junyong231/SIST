package ch01.verify;

public class easdas {

	public static void main(String[] args) {
		
		String point ="02";
		 
		int t = 10;
		String ts = String.valueOf(t) ;
		
		System.out.println(ts);
		System.out.println(ts.matches(".{2}"));
		
		boolean a = point.matches(".{2}");
		System.out.println(a);

	}

}
