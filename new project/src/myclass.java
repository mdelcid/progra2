import java.util.Scanner;


public class myclass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int num;
		num = s.nextInt();
		
		for (int i=1;i<11;i++)
		{
			System.out.println(num*i);
		}

		
		

	}

}
