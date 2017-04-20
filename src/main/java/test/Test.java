package test;

import java.io.IOException;

import lexto.LongLexTo;

public class Test {
	public static void main(String[] args) {
		LongLexTo tokenizer;
		String text = "ใครโทรมาครับโทรมาทำไมครับ โทรมาทำไม";
		try {
			tokenizer = new LongLexTo();
			tokenizer.addDict("lexitron.txt");
			System.out.println(tokenizer.parseToList(text));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
