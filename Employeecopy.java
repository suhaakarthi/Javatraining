public class Employeecopy
     {
        private int id;
        private String name;
    public Employeecopy(int eid, String ename) 
    {
        
        this.id = eid;
        this.name = ename;
        
     }
        public Employeecopy(Employeecopy employee) 
    {
        this.id = employee.id;
        this.name = employee.name;
    }
public static void main(String[]args)
    {
        Employeecopy cred= new Employeecopy(1223 , "karthi") ;
        Employeecopy cred2= new Employeecopy(cred);
        System.out.println(cred2);
    }
}
