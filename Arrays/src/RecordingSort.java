import java.util.Scanner;

public class RecordingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MAX = 5;
		Recording[] rec = new Recording[MAX];
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i < 5)
		{
			System.out.print("Please enter title: ");
			var title = sc.nextLine();
			System.out.print("Please enter artist: ");
			var artist = sc.nextLine();
			System.out.print("Please enter play time: ");
			var playTime = sc.nextLine();
			Recording obj = new Recording();
			obj.setArtist(artist);
			obj.setPlatTime(playTime);
			obj.setTitle(title);
			rec[i]= obj;
			i++;
		}
		
		System.out.println("Enter 1. title sort\2. artist sort\n3. play time sort");
		var option = sc.nextLine();
		
		if(option.equals("1"))
		{
			for (int j = 0; j < rec.length; j++) {
				for (int j2 = j+1; j2 < rec.length; j2++) {
					if(rec[j].getTitle().compareTo(rec[j2].getTitle()) > 0)
					{
						var temp = rec[j];
						rec[j]=rec[j2];
						rec[j2] = temp;
					}
				}
			}
			
			display(rec);
				
		}
		if(option.equals("2"))
		{
			for (int j = 0; j < rec.length; j++) {
				for (int j2 = j+1; j2 < rec.length; j2++) {
					if(rec[j].getArtist().compareTo(rec[j2].getArtist()) > 0)
					{
						var temp = rec[j];
						rec[j]=rec[j2];
						rec[j2] = temp;
					}
				}
			}
			display(rec);
		}
		if(option.equals("3"))
		{
			for (int j = 0; j < rec.length; j++) {
				for (int j2 = j+1; j2 < rec.length; j2++) {
					if(rec[j].getPlatTime().compareTo(rec[j2].getPlatTime()) > 0)
					{
						var temp = rec[j];
						rec[j]=rec[j2];
						rec[j2] = temp;
					}
				}
			}
			display(rec);
		}
		
		
	}

	private static void display(Recording[] rec) {
		for (Recording recording : rec) {
			System.out.println(recording.getArtist() + " " + recording.getTitle() + " " + recording.getPlatTime());
		}
	}

}
