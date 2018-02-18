package edwardspemberton1010;

public class Triangle extends TwoDimensionalShape
{
    public Triangle( int x, int y, int base, int height )
    {
        super( x, y, base, height );
    }
    
    public String getName()
    {
        return "Triangle";
    }
    
    public void print()
    {
        System.out.println( "(" + super.getX() + ", " + super.getY() +
                ") " + "base: " + super.getDimension1() + ", " + "height: " + super.getDimension2() );
    }
    
    public int area()
    {
        return (super.getDimension1()/2) * super.getDimension2();
    }
    
    public void setBase( int base )
    {
        super.setDimension1( base );
    }
    
    public int getBase()
    {
        return super.getDimension1();
    }
    
    public void setHeight( int height )
    {
        super.setDimension2( height );
    }
    
    public int getHeight()
    {
        return super.getDimension2();
    }
}
