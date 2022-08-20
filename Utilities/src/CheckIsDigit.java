
public class CheckIsDigit {

	private static boolean isDigit(String name)
	{
		boolean flag = false;
		char[] chars = name.toCharArray();
		 for(char c : chars){
	         if(Character.isDigit(c)){
	           flag = true;
	          }
	      }
		 return flag;
	}
}
