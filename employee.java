class details
{
    private int eid=1;
    private String name="Sumit";
    private String department="Research";
    public  void getAll()
    {
        System.out.println(eid);
        System.out.println(name);
        System.out.println(department);
    }
    public String getName()
    {
        retrun this.name;
    }
    public String getDepartment()
    {
        retrun this.department;
    }
    public String getEid()
    {
        retrun this.eid;
    }
    public void setAll(String name,int eid,String department)
    {
        this.name=name;
        this.eid=eid;
        this.department=department;
    }
     public void setName(String name)
    {
        this.name=name;
       
    }
     public void setEid(int eid)
    {
       
        this.eid=eid;
    }
     public void setDepartment(String department)
    {
         this.department=department;
    }






}
public class employee
{
    public static void main(String[] args)
    {
        details e=new details();
        e.getAll();
        e.setAll("Deepak",252,"sales");
    }
}