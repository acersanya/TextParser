package text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import reader.FileRead;
import factory.WordPool;

public class Parser {

	private static final String CODE_REGEX = "\\w.+;|.+;\\s*//.+|.+\\{|.*\\}|/\\*.*|\\*.*|\\*/|//.+";
	private static final String SENTENCE_REGEX = "([^(\\.|!|\\?)]+)(\\.|!|\\?)";
	private static final String REGEX_WORD = "([^(\\s)]*)(\\s)*";
	private static final String SPACE_REGEX = "[\\s]+";
	private static final String REGEX_WORD_AND_SIGN = "([\\.,!\\?:;@]{1})|([^\\.,!\\?:;@]*)";
	private List<Sentence> textList = new ArrayList<>();
	private List<Sentence> ascendingList = new ArrayList<>();
	private List<TextElement> codeList = new ArrayList<>();
	private WordPool wordFactory = new WordPool();

	/**
	 * Prints text without code
	 * @return textList
	 */
	public List<Sentence> getText() {
		return textList;
	}

	/**
	 * Parse text
	 * @param path to the input file
	 */
	public void parser(String path) {
		FileRead file = new FileRead(path);
		String text = file.read();
		parseToSentence(text);
		ascendingOrderSentenceLength(ascendingList);
	}

	/**
	 * Prints text with code
	 */
	public void printTextWithCode() {
		for (TextElement i : codeList) {
			System.out.println(i);
		}
	}

	/**
	 * Parses text to sentences using RexExp
	 * Code will be taken away into Code list
	 * @param text to input
	 */
	public void parseToSentence(String text) {
		String temp = null;
		StringTokenizer stringTokenizerToDeleteCode = new StringTokenizer(text, "\n");
		StringBuilder sb = new StringBuilder();
		Pattern pattern = Pattern.compile(CODE_REGEX);
		Matcher matcher;
		while (stringTokenizerToDeleteCode.hasMoreTokens()) {
			temp = stringTokenizerToDeleteCode.nextToken().trim().replaceAll(SPACE_REGEX, " ");
			matcher = pattern.matcher(temp);
			if (matcher.matches()) {
				codeList.add(new Code(temp + "\n"));
			} else {
				sb.append(temp + "\n");
				codeList.add(new Sentence(temp + "\n"));
			}
		}
		pattern = Pattern.compile(SENTENCE_REGEX);
		matcher = pattern.matcher(sb.toString());
		while (matcher.find()) {
			Sentence sentence = new Sentence();
			temp = matcher.group();
			temp = temp.trim().replaceAll(SPACE_REGEX, " ");
			sentence = parseToWord(temp);
			ascendingList.add(new Sentence(temp));
			textList.add(sentence);
		}
	}


	public Sentence parseToWord( String text) {
	Pattern patternWord = Pattern.compile(REGEX_WORD);
	Pattern patternWordAndSign = Pattern.compile(REGEX_WORD_AND_SIGN);		
		Sentence sentence = new Sentence();
		String temp = null;
		Word word;
		Matcher matcher = patternWord.matcher(text);
		while (matcher.find()) {
			temp = matcher.group();
			Matcher match = patternWordAndSign.matcher(temp);
			while (match.find()) {
				temp = match.group();
				word = wordFactory.getWord(temp);
				sentence.add(word);
			}
		}
		return sentence;
	}


	public void restoreText(Sentence text) {
		StringBuilder complete = new StringBuilder();
		List<TextElement> temp = text.getList();
		for (TextElement i : temp) {
			complete.append(i + "\n");
		}
		System.out.println(complete.toString());
	}
	
	
	public void ascendingOrderSentenceLength(List<Sentence> text){
		Collections.sort(text, new Comparator<Sentence>() {
			@Override
			public int compare(Sentence o1, Sentence o2) {
			return	o1.toString().length()-o2.toString().length(); 
			}
		});		Collections.reverse(text);
		
		for(Sentence i: text){
			System.out.println(i);
		}
		
	}
}