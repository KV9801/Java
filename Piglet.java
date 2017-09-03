import java.util.*;

class Piglet
{
	public static void main(String[] args)
	{
		int dice, score=0;
		char ch = 'y';
		System.out.println("Welcome to Piglet!");
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		do
		{
			dice=r.nextInt(6)+1;
			System.out.println("You rolled a "+dice+"!");
			if(dice==1)
			{
				System.out.println("Game Over");
				score = 0;
				break;
			}
			else
			{
				score += dice;
				System.out.println("Continue? (y/n)");
				ch = sc.next().charAt(0);
			}
							
		}while(ch=='y' || ch=='Y');
		System.out.println("You got "+score+" points.");		
	}
}
