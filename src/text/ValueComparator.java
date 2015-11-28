package text;

import java.util.Comparator;
import java.util.Map;

/**
 * Comparator used for sorting map via value;
 */
class ValueComparator implements Comparator<Word> {
	Map<Word, Integer> word;

	public ValueComparator(Map<Word, Integer> word) {
		this.word = word;
	}

	/**
	 * comparing via key. Key is Integer.
	 */
	public int compare(Word a, Word b) {
		if (word.get(a) >= word.get(b)) {
			return -1;
		}
		return 1;
	}
}