class details
{
    private String name="Sumit";
    private int age=19;
    private String country="India";
    public void getAll()
    {
        System.out.println(this.name);
          System.out.println(this.age);
            System.out.println(this.country);

    }
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getCountry()
    {
        return country;
    }
    public void setAll(String name,int age,String country)
    {
        this.name=name;
        this.age=age;
        this.country=country;
    }
    public void setName(String name)
    {
        this.name=name;
        
    }
    public void setAge(int age)
    {
        this.age=age;
        
    }
    public void setCountry(String country)
    {
        this.country=country;
        
    }


}
public class person
{
  public static void main(String[] args)
  {
        details p=new details();
        System.out.println(p.getAge());
        p.setAll("Deepak",24,"Pakistan");
        System.out.println(p.getCountry());
        p.getAll();
  }   
}