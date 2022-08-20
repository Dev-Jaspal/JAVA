import java.util.LinkedList;
import java.util.List;

public class GenericQueue<E> {
	
	LinkedList<E> list = new LinkedList<>();
	
	public void enqueue(E item)
	{
		list.offer(item);
	}
	
	public E dequeue()
	{
		return list.removeFirst();
	}

	 public int getSize() {
		    return list.size();
		  }

		  @Override
		  public String toString() {
		    return "Queue: " + list.toString();
		  }
}
