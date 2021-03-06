/*Name: Taha Rangwala
 * Date: October 12, 2016
 * Purpose: The purpose of this class is to hold individual nodes with the value of the next node as well
 */

//ListNode class header
public class ListNode<T>{ 

	//Declaring private instance variables
	private T value;//The value of the list node
	private ListNode<T> next;//next list node
	
	public ListNode(){
		value=null; next=null;
	} 

	/*Purpose: This is the constructor method that initializes all instance variables
	 * @param initValue value for the list node
	 * @param initNext next list node
	 */
	public ListNode(T initValue, ListNode<T> initNext) {	 
		value=initValue;
		next=initNext;
	} 

	/*Purpose: The purpose of this method is to return the value of the list node
	 * @return This returns a generic type of the value of the list node
	 */
	public T getValue(){ 
		return value;
	} 

	/*Purpose: The purpose of this method is to return the next list node
	 * @return This returns the generic type of the next list node
	 */
	public ListNode<T> getNext(){
		return next;
	} 

	/*Purpose: The purpose of this method is to change the current value of the list node
	 * @param newValue This is the value that is replacing the current value of the list node
	 */
	public void setValue(T newValue){
		value=newValue;
	} 

	/*Purpose: The purpose of this method is to change the next list node
	 * @param newNext This is the list node replacing the next list node
	 */
	public void setNext(ListNode<T> newNext){
		next=newNext;
	}
	
	/*Purpose: The purpose of this method is to check if there is another list node after the current list node
	 * @return This returns a boolean value of whether or not there is a list node after the current list node
	 */
	public boolean hasNext(){
		return getNext() != null;
	}

}