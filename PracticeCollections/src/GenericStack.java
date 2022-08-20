import java.util.ArrayList;

public class GenericStack<E> {
	ArrayList<E> list = new ArrayList<>();
	
	public int getSize()
	{
		return list.size();
	}
	
	public void push(E item)
	{
		list.add(item);
	}
	
	public E peek()
	{
		return list.get(getSize()-1);
	}
	
	public E pop()
	{
		E last = list.get(getSize()-1);
		list.remove(getSize()-1);
		return last;
	}
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}

	@Override
	public String toString() {
		return "GenericStack [list=" + list + "]";
	}
	
	
	
}
