package edwardspemberton1010;

public abstract class TwoDimensionalShape extends Shape
{
    private int dimension1, dimension2;
    
    public TwoDimensionalShape( int x, int y, int d1, int d2 )
    {
        super( x,y );
        dimension1 = d1;
        dimension2 = d2;
    }
    
    public void setDimension1( int d )
    {
        dimension1 = d;
    }
    
    public void setDimension2( int d )
    {
        dimension2 = d;
    }
    
    public int getDimension1()
    {
        return dimension1;
    }
    
    public int getDimension2()
    {
        return dimension2;
    }
    
    public abstract int area();
}