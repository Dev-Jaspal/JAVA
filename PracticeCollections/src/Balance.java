import java.util.Iterator;
import java.util.Stack;

public class Balance {

	public static void main(String[] args) {
		String exp = "[5*(5+6)]";
		System.out.println("Expression is balanced: " + isBalanced(exp));

	}
	
	public static boolean isBalanced(String exp) {
		boolean balanced = false;
		Stack<Character> str = new Stack<Character>();
		if(exp.length() == 0 || exp.isEmpty())
		{
			return balanced;
		}
		else
		{
			for (int i=0; i< exp.length(); i++) {
				if(exp.charAt(i) == '{' || exp.charAt(i) == '[' || exp.charAt(i) == '(')
					str.push(exp.charAt(i));
				else
					if(exp.charAt(i) == '}' || exp.charAt(i) == ']' || exp.charAt(i) == ')')
						str.pop();
			}
			
			if(str.isEmpty())
				balanced = true;
		}
		
		return balanced;
	}
}
