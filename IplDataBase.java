package Collection1;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import Collection.Student;


public class IplDataBase 
{
	List l=new ArrayList();
	Scanner sc=new Scanner(System.in);

	
	public void addTeam()
	{
		System.out.print("Enter Team Number : ");
		int teamno=sc.nextInt();
		System.out.print("Enter Team Name : ");
		String teamname = sc.next();
		System.out.print("Enter a Points : ");
		int points=sc.nextInt();
		
		Ipl ipl =new Ipl(teamno,teamname,points);
		for(int i=0;i<l.size();i++)
		{
					
		}
		l.add(ipl);
		System.out.println(" IPL Team is Added");
	}
	public void removeTeam()
	{
		System.out.print("Enter Team Number : ");
		int teamno  = sc.nextInt();
		for(int i=0;i<l.size();i++)
		{
			Ipl ipl = (Ipl)l.get(i);
			if(ipl.teamno==teamno)
			{
				l.remove(ipl);
				System.out.println("IPL Team is Removed");
				return;
			}
		}
		System.err.println("Team is not found");
	}
	public void updateTeam()
	{
		System.out.print("Enter Team Number : ");
		int teamno = sc.nextInt();
		for(int i=0;i<l.size();i++)
		{
			Ipl ipl = (Ipl)l.get(i);
			if(ipl.teamno==teamno)
			{
				System.out.println("1.Points 2.Win or Lose Status");
				switch(sc.nextInt())
				{
				case 1: 
				{
					System.out.print("Enter Points : ");
					ipl.points= sc.nextInt();
					System.out.println("Points is Updated");
				}
				break;
				
				case 2:
				{
					System.out.println("Enter 1.First Match 2.Second Match 3.Third Match 4.Fourth Match 5.Fifth Match");
					int select = sc.nextInt();
					if(select<=ipl.winorloss.length)
					{
						ipl.winorloss[select-1]=sc.next().charAt(0);
						System.out.println("Win or Lose Status is updated");
					}
				}
				}
			}
		}
		
	}
	public void searchTeam()
	{
		System.out.print("Enter Team Number : ");
		int teamno = sc.nextInt();
		for(int i=0;i<l.size();i++)
		{
			Ipl ipl=(Ipl)l.get(i);
			
			
			if(ipl.teamno==teamno)
			{
				System.out.println(ipl);
				return;
			}
			else
			{
				System.out.println("Enter correct Team Number");
			}
			
		}
	}
	public void display()
	{
		System.out.println(l);
	}

}
