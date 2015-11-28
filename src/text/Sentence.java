package text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sentence implements TextElement {

	
	private List<TextElement> list;
	private String string;

	public Sentence() {
		list = new ArrayList<>();
	}


	@Override
	public String toString() {
		return string;
	}


	/**
	 * Sentence constructor
	 */
	public Sentence(String string) {
		this.string = string;
	}

	/**
	 * Add word to the list
	 */
	@Override
	public void add(TextElement obj) {
		list.add(obj);
	}

	/**
	 * Remove word from the list
	 */
	@Override
	public void remove(TextElement obj) {
		list.remove(obj);
	}

	@Override
	public TextElement getObj(int index) {
		return list.get(index);
	}

	/**
	 * Iterate through the list. Returns list iterator.
	 */
	@Override
	public Iterator<TextElement> getiter() {
		Iterator<TextElement> iter = list.iterator();
		return iter;
	}

	/**
	 * Get word list
	 */
	@Override
	public List<TextElement> getList() {
		return list;
	}
	
	public int capacity(){
		return list.size();
	}
	
}
