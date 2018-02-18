package edwardspemberton1010;

public class ShapeTest
{

    private Shape shapeArray[];
    private TwoDimensionalShape twoDArray[];
    private ThreeDimensionalShape threeDArray[];
    
    public ShapeTest()
    {
        shapeArray = new Shape[6];
        twoDArray = new TwoDimensionalShape[3];
        threeDArray = new ThreeDimensionalShape[3];
        
        Circle circle = new Circle( 2, 8, 3 );
        shapeArray[0] = circle;
        twoDArray[0] = circle;
        
        Square square = new Square( 7, 6 , 5 );
        shapeArray[1] = square;
        twoDArray[1] = square;
        
        Triangle triangle = new Triangle( 3, 4, 4, 5 );
        shapeArray[2] = triangle;
        twoDArray[2] = triangle;
        
        Sphere sphere = new Sphere( 8, 9, 8 );
        shapeArray[3] = sphere;
        threeDArray[0] = sphere;
        
        Cube cube = new Cube( 7, 6, 3 );
        shapeArray[4] = cube;
        threeDArray[1] = cube;
        
        Tetrahedron tetrahedron = new Tetrahedron( 8, 10, 11, 22 );
        shapeArray[5] = tetrahedron;
        threeDArray[2] = tetrahedron;
    }
    
    public void displayShapeInfo()
    {
        for(int i = 0; i < shapeArray.length; i++)
        {
            System.out.print( shapeArray[i].getName() + ": ");
            shapeArray[i].print();
        }
        
        for(int j = 0; j < twoDArray.length; j++)
            System.out.println( twoDArray[j].getName() + "'s area is "
                    + twoDArray[j].area() );
        
        for(int k = 0; k < threeDArray.length; k++)
        {
            System.out.println( threeDArray[k].getName() +
                    "'s area is " + threeDArray[k].area() );
            System.out.println( threeDArray[k].getName() +
                    "'s volume is " + threeDArray[k].volume() );
        }
    }
    
    public static void main(String[] args)
    {
        ShapeTest driver = new ShapeTest();
        driver.displayShapeInfo();
    }
    
}