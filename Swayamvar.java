import java.util.Scanner;
import java.util.LinkedList; 
import java.util.Queue; 
class Swayamvar
{
public static void main(String args[])
	{
		Queue<Character> qb= new LinkedList<Character>();
		Queue<Character> qg= new LinkedList<Character>();
		int n=0;
		String b= " ";
		String g= " ";
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		b=sc.next();
		g=sc.next();
	if(b.length()==g.length())
	{	
		for(int i=0;i<b.length();i++)
		{
			qb.add(b.charAt(i));
			qg.add(g.charAt(i));
		}
		
		//System.out.println(qb + " " + qg);
		for(int i=0;i<=5;i++)
		{
		if(qb.element()==qg.element())
		{
			qb.remove();
			qg.remove();
		}
		else if(qb.element()!=qg.element())
		{
			char it=qg.remove();
			qg.add(it);
		}
		
		}
		System.out.println(qb.size());
	}
	else System.out.println("Number of bride and groom must be same");
	}

}
