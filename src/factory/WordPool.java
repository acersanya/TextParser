package factory;

import java.util.HashMap;
import java.util.Map;

import text.Word;

/**
 * Factory for creating Words Searches Word in map, if word already exists
 * returns reference for exciting Word or creates new Word and place it into
 * HashMap.
 */

public class WordPool implements WordCreater {
	// HashMap holds reference to the excising object.
	private static final Map<String, Word> words = new HashMap<>();

	@Override
	public Word getWord(String word) {
		if (word == null) {
			return null;
		}

		else if (words.containsKey(word)) {
			return words.get(word);
		} else {
			words.put(word, new Word(word));
			return words.get(word);
		}
	}
}
