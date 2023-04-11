package Collection1;

import java.util.Scanner;

public class Ipl 
{
	int teamno;
	String teamname;
	int points;
	char [] winorloss = new char[5];
	
	public Ipl(int teamno,String teamname,int points)
	{
		this.teamno=teamno;
		this.teamname=teamname;
		this.points=points;
		m1();
	}
	public void m1()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter loss or win : ");
		for(int i=0;i<winorloss.length;i++)
		{
			winorloss[i]=sc.next().charAt(0);
			
		}
		
	}
	public String toString()
	{
		String data="";
		data=data+"Team Name = "+teamno+"."+teamname+" , "+
		"Points = "+points+" , "+"Win or Loss = {";
		for(int i=0;i<winorloss.length;i++)
		{
			data+=winorloss[i]+", ";
		}
		return data+"}";
	}

}
