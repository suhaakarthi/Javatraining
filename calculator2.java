class calculator2
{
public static void main(String[] args)
{ 
calculator2 calc=new calculator2();
calc.add(10,20);
calc.add(10,20,30);
}
void add(int no1,int no2,int no3)
{
System.out.println(no1+no2+no3);
}
void add(int no1,int no2)
{
System.out.println(no1+no2);
}
}
