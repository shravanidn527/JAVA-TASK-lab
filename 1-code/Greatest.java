class GreatestNumber
{
public static void main(String args[])
{
int a=40,b=10,c=4,large;
large=(a<b)?(a<c?a:c):(b>c?b:c);
System.out.println("Largest number among" +a+ ","+b+" and "+c+" is "+large);
}
}