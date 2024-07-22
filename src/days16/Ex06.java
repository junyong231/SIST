//package days16;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//
///**
// * @author JUNYONG
// * @Date 2024. 7. 22.=오후 4:07:41
// * @subject
// * @content
// *
// */
//public class Ex06 {
//
//	public static void main(String[] args) {
//
//		String filename = ".\\src\\days16\\SS21.txt";
//		//System.out.println(System.getProperty("user.dir")); // .과 같다
//		
//		String [] nameArr = getFileContent(filename);
//
//		String content = "<ol><li>" + String.join("</li><li>", nameArr) + "</li></ol>";
//
//	}//main
//	
//	private static String [] getFileContent(String fileName) {
//
//
//		try(	FileReader reader = new FileReader(fileName);
//				//보조스트림
//				BufferedReader bufferedReader = new BufferedReader(reader)) {
//
//			String line = null;
//			String [] nameArr = new String[10];
//			int index =0;
//			while ((line = bufferedReader.readLine()) != null) {
//				//System.out.printf("%d: %s\n", lineNumber++, line);
//				fileName+=line+"\n";
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return nameArr;
//	}
//}//class
