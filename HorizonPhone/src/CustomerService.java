import javax.swing.JOptionPane;

public class CustomerService {

    final static int TALK_MINUTE = 500;
	public static void main(String... a)
	{
		String talkTime = JOptionPane.showInputDialog("Please enter the maximum talk minute used monthly.");
		String textMsg = JOptionPane.showInputDialog("Please enter the maximum text message sent monthly.");
		String dataUsed = JOptionPane.showInputDialog("Please enter the maximum maximum data used monthly.");
		
		int talkMinute = Integer.parseInt(talkTime);
		int msg = Integer.parseInt(textMsg);
		int data = Integer.parseInt(dataUsed);
		if(talkMinute < TALK_MINUTE && (msg == 0 && data == 0))
		{
			JOptionPane.showMessageDialog(null, "You should choose Plan A at $49 per month.");
		}
		else if(talkMinute < TALK_MINUTE && msg > 0)
		{
			JOptionPane.showMessageDialog(null, "You should choose Plan B at $55 per month.");
		}
		else if(talkMinute >= TALK_MINUTE && data == 0 && (msg > 0 && msg <=100))
		{
			JOptionPane.showMessageDialog(null, "You should choose Plan C at $61 per month.");
		}
		else if(talkMinute >= TALK_MINUTE && data == 0 && msg >=100)
		{
			JOptionPane.showMessageDialog(null, "You should choose Plan D at $70 per month.");
		}
		else if(data > 0 && data <= 3 )
		{
			JOptionPane.showMessageDialog(null, "You should choose Plan E for 3GB data at $79 per month.");
		}
		else if(data > 3)
		{
			JOptionPane.showMessageDialog(null, "You should choose Plan F for more data at $87 per month.");
		}
		
	}
}
