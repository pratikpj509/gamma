class Employ
{
    String name, add, mail;
    float id, mobile, basic;
    void salary()
    {
      float da, hra, pf, scf, gross;
      da=basic*97/100;
      hra=basic*10/100;
      pf=basic*12/100;
      scf=basic*0.1f/100;
      gross=basic+da+hra-pf-scf;
      System.out.println("Name:  "+name);
       System.out.println("salary salary:  "+basic);
       System.out.println("gross salary:  "+gross);
    }
    
}
class Programmer extends Employ
{
    Programmer(String n, int sal)
    {
        this.name=n;
        this.basic=sal;
    }
}
class teamLead extends Employ
{
    teamLead(String n, int sal)
    {
        this.name=n;
        this.basic=sal;
    }
}
class APM extends Employ
{
    APM(String n, int sal)
    {
        this.name=n;
        this.basic=sal;
    }
}
class ProjectManager extends Employ
{
    ProjectManager(String n, int sal)
    {
        this.name=n;
        this.basic=sal;
    }
}
public class inheritance
{
    public static void main(String args[])
    {
    Programmer e1= new Programmer("Pratik", 40000);
    e1.salary();
    }
}