
public class GenericClass <T>{
    private T obj;

	public T getObj() {
		return obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public GenericClass(T obj) {
			this.obj = obj;
	}
	
	public T print(T[] obj)
	{
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		
		return (T)obj;
	}
  
}
