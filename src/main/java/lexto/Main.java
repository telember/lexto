package lexto;

import java.io.IOException;

public class Main {
	

	LongLexTo tokenizer;
	public static void main(String[] args) {
		String input = "test";
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
