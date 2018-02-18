package edwardspemberton1010;

public class Tetrahedron  extends ThreeDimensionalShape
{
    public Tetrahedron( int x, int y, int height, int side )
    {
        super( x, y, height, side, side );
    }
    
    public String getName()
    {
        return "Tetrahedron";
    }
    
    public int area()
    {
        return (int) ((Math.sqrt (3))/(4)*getDimension1()*getDimension1());
    }
    
    public int volume()
    {
        return (int) ((Math.sqrt(2))/(12) * getDimension1()*getDimension1()*getDimension1());
    }
    
    public void print()
    {
        System.out.println( "(" + super.getX() + ", " + super.getY() +
            ") " + "side: " + super.getDimension1() + ", " + "height: " + super.getDimension2() );
    }
    
    public void setside(int side)
    {
        super.getDimension1(side);
    }

    public int getSide()
    {
        return super.getDimension1();
    }
    
    public void setHeight(int height)
    {
        super.getDimension2(height);
    }

    public int getHeight()
    {
        return super.getDimension2();
    }
}