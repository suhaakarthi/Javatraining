class Theatre1
    {
  void bookTicket(int amount)
      {
       int amount=200;
    System.out.println("Balance is "+ (amount-120)); 
       }
    }
class Customer
    {
        public static void main(String[] args)
        {
            Theatre1 theatre = new Theatre1();
            theatre.bookticket();
            
        }
    }


