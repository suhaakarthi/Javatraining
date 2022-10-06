class calculator
{
public static void main(String[] args)
{
calculator calc=new calculator();
calc.add(); //method calling statement
calc.subtract();
calc.multiply();
calc.divide();
}
void add() //method signature
{ //method
System.out.println(10+20);
}
void subtract()
{
System.out.println(30-10);
}
void multiply()
{
System.out.println(10*20);
}
void divide()
{
System.out.println(30/3);
}
}

