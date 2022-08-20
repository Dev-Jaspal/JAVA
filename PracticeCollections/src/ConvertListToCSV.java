import java.util.ArrayList;
import java.util.List;

public class ConvertListToCSV {

	public static void main(String[] args) {
		
		List<String> lst = new ArrayList<>(){
			{
			this.add("Java");
			this.add("C++");
			this.add("Android");
			}
		};
		
		ConvertLstCSv(lst);
	}
	
	static void ConvertLstCSv(List<String> lst)
	{
		StringBuilder sb = new StringBuilder();
		for (String string : lst) {
			if(!sb.isEmpty()) {
				sb.append(",");
			}
			sb.append(string);
		}
		System.out.println(sb);
	}

}
