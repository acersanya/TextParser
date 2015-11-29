package com.epam.text.entitites;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sentence implements TextElement {

	private List<TextElement> list;
	private String string;

	public Sentence() {
		list = new ArrayList<>();
	}

	public String toString(){
		return list.toString();
	}
	
	
	public Sentence(String string) {
		this.string = string;
	}

	public void add(TextElement obj) {
		list.add(obj);
	}

	public void remove(TextElement obj) {
		list.remove(obj);
	}

	public TextElement getObj(int index) {
		return list.get(index);
	}

	public Iterator<TextElement> getiter() {
		Iterator<TextElement> iter = list.iterator();
		return iter;
	}

	public List<TextElement> getList() {
		return list;
	}

	public int capacity() {
		return list.size();
	}

}
