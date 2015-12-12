package lexto;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

public class Main {
	
	ClassLoader classLoader = getClass().getClassLoader();
	LongLexTo tokenizer;
	public static void main(String[] args) {
		String str = "กูละเบื่อไอ้พวกคนไทยบัดซบปัญญาอ่อนจริงๆ เค้าจูงจมูกพวกมึงไปไหนมึงก็ไปกับเค้าหมด ไอ้ที่พวกมึงทะเลาะกันฆ่ากันเองอยู่นี่ "
				+ "เพราะมีคนต้องการให้มันเกิดขึ้น ใช้สมองอันน้อยนิดของพวกมึงคิดบ้างสิโว้ย ไอ้กระทู้ปัญญาอ่อนต่างๆเลิกตั้งได้แล้ว"
				+ " ป่านนี้ไอ้พวกนั้นมันคงหัวเราะในความโง่ของพวกมึงอยู่ อีกไม่นานพวกมึงก็สิ้นชาติกันแล้วกูดีใจด้วย";
		
		String input = "พบศพผู้เสียชีวิตแล้ว";
		new Main().TokenzerTest( input);
		}
	
	private void TokenzerTest(String input){
		try {
			tokenizer = new LongLexTo();	
		
			System.out.println(tokenizer.parseToString(input));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
