import java.util.*;

public class Exercise_24_5 extends GenericQueue {

	public static void main(String[] args) {
		GenericQueue<Integer> newGenericQueue = new GenericQueue<>();
		newGenericQueue.enqueue(15);
		newGenericQueue.enqueue(30);
		System.out.println(newGenericQueue.size());
		newGenericQueue.dequeue();
		System.out.println(newGenericQueue.size());
		
	}
}