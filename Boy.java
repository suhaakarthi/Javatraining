class Boy
{

public static void main(String[] args)
{
Boy raja = new Boy(); 
raja.go(); 
}
void go() //instance - object - non-static method
{
    purchase(); 
}
void purchase()
{
    int amount=100; // value: 
    System.out.println(amount); 
    give_cash(); 
}
void give_cash()
{
    get_balance(); 
}
void get_balance()
{
int balance=10;
System.out.println(balance);
} 
}
