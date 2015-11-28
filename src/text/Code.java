package text;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author Александр
 * Here we store code objects.
 * Code objects are leafs in Composite pattern
 */
public class Code implements TextElement {
 
	private String code;
	
	 public Code(String code) {
		this.code = code;
	}
	
	
	
	@Override
	public String toString() {
		return  code;
	}

/**
 * getter
 */

	public String getCode() {
		return code;
	}


/**
 * @param setter
 */
	public void setCode(String code) {
		this.code = code;
	}

/**
 * Not implemented this is leaves in composite pattern
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
