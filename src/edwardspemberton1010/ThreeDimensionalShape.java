package edwardspemberton1010;

public abstract class ThreeDimensionalShape extends Shape
{
    private int dimension1, dimension2, dimension3;
    
    public ThreeDimensionalShape( int x, int y, int d1, int d2, int d3 )
    {
        super( x, y );
        dimension1 = d1;
        dimension2 = d2;
        dimension3 = d3;
    }
    
    public void setDimension1( int d )
    {
        dimension1 = d;
    }
    
    public void setDimension2( int d )
    {
        dimension2 = d;
    }
    
    public void setDimension3( int d )
    {
        dimension3 = d;
    }
    
    public int getDimension1()
    {
        return dimension1;
    }
    
    public int getDimension2()
    {
        return dimension2;
    }
    
    public int getDimension3()
    {
        return dimension3;
    }
    
    public abstract int area();
    public abstract int volume();

    public void getDimension1(int radius)
    {
        
    }

    public void getDimension2(int height)
    {
        
    }
}