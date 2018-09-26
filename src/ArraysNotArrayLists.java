
public class ArraysNotArrayLists<E,P> {
	private class Pair<E,P>{
		E entry;
		P priority;
	}
	
	Object [] heap;
	
	public ArraysNotArrayLists(){
		heap = new Object[10];
	}
	
	public E peek(){
		return ((Pair<E,P>)heap [0]).entry;
	}
}
