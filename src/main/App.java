package main;


import java.util.ArrayList;
import java.util.List;

import text.Parser;
import text.Sentence;
import text.TextElement;

public class App {
	public static void main(String[] args) {
		Parser a = new Parser();
		a.parser("/home/acersanya/Documents/texttoread.txt");

		List<Sentence> s = a.getText();
		
		
		
	

	}
}
