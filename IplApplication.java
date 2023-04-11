package Collection1;
import java.util.Scanner;

public class IplApplication 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		IplDataBase idb = new IplDataBase();
		for(;;)
		{
			System.out.println("1.Add IPL Team"+"\n"+
					"2.Remove IPL Team"+"\n"+
					"3.Update IPL Team"+"\n"+
					"4.Search IPL Team"+"\n"+"5.Exit"+"\n"+"6.Display IPL Team");
			switch(sc.nextInt())
			{
			case 1:
				idb.addTeam();
				break;
				
			case 2:
				idb.removeTeam();
				break;	
			 case 3:
			    	idb.updateTeam();
			    	break;
			    case 4:
			    	idb.searchTeam();
			    	break;
			    case 5:
			    	System.err.println("Application is closed");
			    	System.exit(1);
			    	break;
			    case 6:
			    	idb.display();
			}
		}
		
	}

}
