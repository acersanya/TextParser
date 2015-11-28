package text;

import java.util.Iterator;
import java.util.List;

/**
 * @author Alexander 
 * General methods used to work with text.
 */

public interface TextElement {
	public void add(TextElement obj);

	public void remove(TextElement obj);

	public TextElement getObj(int index);

	Iterator<TextElement> getiter();

	public List<TextElement> getList();

}
