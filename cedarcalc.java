import java.util.*;
public class cedarcalc
{
	public static void main(String[] args)
	{
		int nstudents, time, chap;
		double cost1, cost2, cost3, cost4, cost5;

		Scanner userinput = new Scanner(System.in);
		{
			 System.out.printf("How many students are going: ");
			 nstudents = userinput.nextInt();
			 System.out.printf("When will you guys be going, type 1 for fall and 2 for spring: ");
			 time = userinput.nextInt();
			 chap = nstudents/4;
			 System.out.printf("You will need this many chaperones");
			 System.out.printf("%40d", chap);
			 cost1 = (nstudents*39.00);
			 System.out.printf("\nFall cost of admission: ");
			 System.out.printf("%50.2f", cost1);
			 cost2 = (nstudents*42.00);
			 System.out.printf("\nSpring cost of admission: ");
			 System.out.printf("%48.2f", cost2);
			 cost3 = nstudents*25;
			 System.out.printf("\nCost of Food: ");
			 System.out.printf("%60.2f", cost3);
			 if(time<2)
			 {
				if(nstudents<45)
			 	{
			 		cost5 = 1300.42+(nstudents*42.00)+(nstudents*25);
				}
			 	else
			 	{
					cost5 = 1738.92+(nstudents*42.00)+(nstudents*25);
			 	}
			 }
			 else
			 {
				if(nstudents<45)
				{
					cost5 = 1300.42+(nstudents*39.00)+(nstudents*25);
				}
				else
				{
					cost5 = 1738.92+(nstudents*39.00)+(nstudents*25);
			 	}
			 }

			 System.out.printf("\nThe total cost is: ");
			 System.out.printf("%55.2f", cost5);
			 System.out.println();
		 }
	 }
 }