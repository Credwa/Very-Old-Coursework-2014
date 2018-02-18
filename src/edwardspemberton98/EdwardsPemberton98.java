/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edwardspemberton98;

/**
 *
 * @author Craig
 */
public class EdwardsPemberton98 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Quadrilateral quad = new Quadrilateral(10,7,15,7,15,11,10,11);
        Trapezoid trap = new Trapezoid(0, 0, 10, 0, 8, 5, 3, 5);
        Parallelogram parallelogram = new Parallelogram(10, 10, 22, 10, 14, 40, 12, 40);
        Rectangle rectangle = new Rectangle(32, 28, 60, 28, 60, 56, 34, 56);
        Square square = new Square(5, 0, 10, 0, 10, 4, 5, 4);

        System.out.printf("%s%s%s%s%s", quad, trap, parallelogram, rectangle, square);

    }

    public static class Quadrilateral {

        private double x1, y1, x2, y2, x3, y3, x4, y4;

        public Quadrilateral(double posX1, double posY1, double posX2, double posY2, double posX3, double posY3, double posX4, double posY4) {
            x1 = posX1;
            y1 = posY1;
            x2 = posX2;
            y2 = posY2;
            x3 = posX3;
            y3 = posY3;
            x4 = posX4;
            y4 = posY4;
        }

        public double getX1() {
            return x1;
        }

        public double getX2() {
            return x2;
        }

        public double getX3() {
            return x3;
        }

        public double getX4() {
            return x4;
        }

        public double getY1() {
            return y1;
        }

        public double getY2() {
            return y2;
        }

        public double getY3() {
            return y3;
        }

        public double getY4() {
            return y4;
        }

        public void setPoint1(double x1, double y1) {
            this.x1 = x1;
            this.y1 = y1;
        }

        public void setPoint2(double x2, double y2) {
            this.x2 = x2;
            this.y2 = y2;
        }

        public void setPoint3(double x3, double y3) {
            this.x3 = x3;
            this.y3 = y3;
        }

        public void setPoint4(double x4, double y4) {
            this.x4 = x4;
            this.y4 = y4;
        }

        public String toString() {
            return ("\nCoordinates of Quadrilateral are:\n "
                    + "(" + getX1() + "," + getY1() + ")" + "," + "(" + getX2() + "," + getY2() + ")" + "," + "(" + getX3() + "," + getY3() + ")" + "," + "(" + getX4() + "," + getY4() + ")" + "\n");
        }
    }

    public static class Trapezoid extends Quadrilateral {

        public Trapezoid(double posX1, double posY1, double posX2, double posY2, double posX3, double posY3, double posX4, double posY4) {
            super(posX1, posX1, posX2, posY2, posX3, posY3, posX4, posY4);
        }

        public double getHeight() {
            return (Math.abs(getY1() - getY4()));
        }

        public double getsideA() {
            return (Math.abs(getX1() - getX2()));
        }

        public double getsideB() {
            return (Math.abs(getX3() - getX4()));
        }

        public double getArea() {
            double sideA = getsideA();
            double sideB = getsideB();
            double height = getHeight();

            return (.5 * height * (sideA + sideB));
        }

        public String toString() {
            return ("\nCoordinates of Trapezoid are:\n "
                    + "(" + getX1() + "," + getY1() + ")" + "," + "(" + getX2() + "," + getY2() + ")" + "," + "(" + getX3() + "," + getY3() + ")" + "," + "(" + getX4() + "," + getY4() + ")" + "\nHeight is: " + getHeight() + "\nArea is :" + getArea() + "\n");
        }
    }

    public static class Parallelogram extends Trapezoid {

        public Parallelogram(double posX1, double posY1, double posX2, double posY2, double posX3, double posY3, double posX4, double posY4) {
            super(posX1, posX1, posX2, posY2, posX3, posY3, posX4, posY4);
        }

        public double getWidth() {
            return getsideA();
        }

        public double getArea() {
            return (getWidth() * getHeight());
        }

        public String toString() {
            return ("\nCoordinates of Parallelogram are:\n "
                    + "(" + getX1() + "," + getY1() + ")" + "," + "(" + getX2() + "," + getY2() + ")" + "," + "(" + getX3() + "," + getY3() + ")" + "," + "(" + getX4() + "," + getY4() + ")" + "\nWidth is: " + getWidth() + "\nHeight is: " + getHeight() + "\nArea is :" + getArea() + "\n");
        }
    }

    public static class Rectangle extends Parallelogram {

        public Rectangle(double posX1, double posY1, double posX2, double posY2, double posX3, double posY3, double posX4, double posY4) {
            super(posX1, posX1, posX2, posY2, posX3, posY3, posX4, posY4);
        }

        public double getArea() {
            return (getWidth() * getHeight());
        }

        public String toString() {
            return ("\nCoordinates of Rectangle are:\n "
                    + "(" + getX1() + "," + getY1() + ")" + "," + "(" + getX2() + "," + getY2() + ")" + "," + "(" + getX3() + "," + getY3() + ")" + "," + "(" + getX4() + "," + getY4() + ")" + "\nWidth is: " + getWidth() + "\nHeight is: " + getHeight() + "\nArea is :" + getArea() + "\n");
        }
    }

    public static class Square extends Rectangle {

        public Square(double posX1, double posY1, double posX2, double posY2, double posX3, double posY3, double posX4, double posY4) {
            super(posX1, posX1, posX2, posY2, posX3, posY3, posX4, posY4);
        }

        public double getSide() {
            return getWidth();
        }

        public String toString() {
            return ("\nCoordinates of Square are:\n "
                    + "(" + getX1() + "," + getY1() + ")" + "," + "(" + getX2() + "," + getY2() + ")" + "," + "(" + getX3() + "," + getY3() + ")" + "," + "(" + getX4() + "," + getY4() + ")" + "\nWidth is: " + getWidth() + "\nHeight is: " + getHeight() + "\nArea is :" + getArea() + "\n");
        }
    }
}