package text;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Alexander Haliy Words are leaves in Composite pattern, not
 *         implementing inerface methods.
 */
public final class Word implements TextElement {

	private String word;

	/**
	 * @param word
	 *            consturctor
	 */
	public Word(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return word;
	}

	/**
	 * Getter
	 * 
	 * @return word
	 */
	public String getWord() {
		return word;
	}

	/**
	 * Setter
	 * 
	 * @param word
	 */
	public void setWord(String word) {
		this.word = word;
	}

	/**
	 * Override hash code for HashMap
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}

	/**
	 * check if equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}

	/**
	 * Not implemented methods. Words are leaves in composite pattern.
	 */

	@Override
	public void add(TextElement obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(TextElement obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public TextElement getObj(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<TextElement> getiter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TextElement> getList() {
		// TODO Auto-generated method stub
		return null;
	}

}
