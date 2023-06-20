package eh102.linkedlist;

public class LinkedListNode1 {
	private String data;
	private LinkedListNode1 next;

	/**
	 * Gets the data item for this node
	 * @return the data item
	 */
	public String getData() {
		return data;
	}

	/**
	 * Sets the data item for this node
	 * @param data the data item
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * Gets the next node in the list, or null if this is the last node
	 * @return the next node
	 */
	public LinkedListNode1 getNext() {
		return next;
	}

	/**
	 * Sets the next node in the list
	 * @param next the next node
	 */
	public void setNext(LinkedListNode1 next) {
		this.next = next;
	}
}
