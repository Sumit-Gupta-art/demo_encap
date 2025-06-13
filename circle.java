class field{    private double radius ;
    public double getRadius()
    {
        return this.radius;
    }
    public double calculateArea()
    {
       return (this.radius=3.14*(radius*radius));
       
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }

}
public class circle
{
    public static void main(String[] args)
    {
        field f=new field();
        System.out.println(f.calculateArea());
        f.setRadius(9.8);
        System.out.println(f.calculateArea());
    }
}