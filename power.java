package Add;

public class power 
{
public static void main (String[] args)
{
	int base=1;
	int power=1;
	while(base<=5 &&power<=5)
	{
		System.out.println(Math.pow(base, power));
		base=base+1;
		power=power+1;
	}
}
}


