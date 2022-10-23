// calculator in java //
/* need 2 number as input */

import java.util.Scanner;
class calci 
{
	public static void main(String[] args) {
		int n1,n2,ch,cal;
		System.out.println("Enter two number ");
		Scanner r=new Scanner(System.in);
		n1=r.nextInt();
		n2=r.nextInt();
		System.out.print("Select the operation ");
		ch=r.nextInt();

		if (ch==1)
		 {
		 	cal=n1+n2;
		 	System.out.print("Additon Result"+cal);
			
		}

		else if (ch==2)
		 {
		 	cal = n1-n2;
		 	System.out.print("Subtraction Result"+cal);

			
		}

		else if (ch==3)
		 {
		 	cal= n1*n2;
		 	System.out.print("Multiplication "+cal);
			
		}
		
		else if (ch==4)
		 {
			cal=n1/n2;
			System.out.print("Division Result"+cal);
			
		}
		
		else
		{
			cal=n1%n2;
			System.out.print("Remainder Result"+cal);
		}
		



	}
}