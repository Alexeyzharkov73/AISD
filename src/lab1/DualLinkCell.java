package lab1;


public class DualLinkCell<T> {
	private T value;
	private DualLinkCell<T> next;
	private DualLinkCell<T> previous;
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public DualLinkCell<T> getNext() {
		return next;
	}
	public void setNext(DualLinkCell<T> next) {
		this.next = next;
	}
	public DualLinkCell<T> getPrevious() {
		return previous;
	}
	public void setPrevious(DualLinkCell<T> previous) {
		this.previous = previous;
	}
	
	
	
}
