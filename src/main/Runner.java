package main;

import java.util.ArrayList;
import java.util.List;

import com.epam.text.entitites.Parser;
import com.epam.text.entitites.Sentence;
import com.epam.text.entitites.TextElement;

public class Runner {
	public static void main(String[] args) {
		Parser a = new Parser();
		a.parser("/home/acersanya/Documents/texttoread.txt");
		System.out.println("HELLO");
	}
	
}
