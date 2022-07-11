import java.util.Scanner;
class largestofNum{
public static void main(String args[])
{
	Scanner so=new Scanner(System.in);
	System.out.print("Enter first value:");
	int firstNum=so.nextInt();
	System.out.print("Enter second value:");
	int secondNum=so.nextInt();
	if(firstNum>secondNum)
	{
		System.out.println(firstNum+"is greatest");
	}
	else{
		System.out.println(secondNum+"is greatest");
	}
}
}