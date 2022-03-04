import java.util.*;

public class GenericQueue<E> extends LinkedList<E> {
	public static void main(String[] args) {
	
	}
	LinkedList<E> list;
	public void enqueue(E e){
		this.addLast(e);
	}
	public E dequeue(){
		return removeFirst();
	}
	public int getSize(){
		return list.size();
	}
	@Override
	public  String toString(){
		return "Queue: " + list.toString();
	}
}