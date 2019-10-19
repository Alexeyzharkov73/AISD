package lab1;

public class Stack<T> {
	private DualLinkCell<T> tail;
	public T pop() {
		if(tail == null) {
			return null;
		}
		DualLinkCell<T> tmp = tail;
		tail = tail.getPrevious();
		return tmp.getValue();
	}
	
	public void push(T value)  {
		if(tail == null) {
			tail = new DualLinkCell<T> ();
			tail.setValue(value);
			return;
		}
		tail.setNext(new DualLinkCell<T> ());
		tail.getNext().setPrevious(tail);
		tail = tail.getNext();
		tail.setValue(value);
	}
}

