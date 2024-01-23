class ShapeAreaCalculator{
    
    //Function for calculating area of square
    public void calculateArea(int sideLength){
        int area = sideLength*sideLength;
        System.out.println("Area of the square = "+area);
    }

    //Function for calculating area of rectangle
    public void calculateArea(int width,int length){
        int area = length*width;
        System.out.println("Area of the rectangle = "+area);
    }

    //Function for calculating area of circle
    public void calculateArea(double radius){
        double area = Math.PI*radius*radius;
        System.out.printf("Area of the circle = %.2f",area);
    }

}

public class Main{
    public static void main(String[] args) {
        ShapeAreaCalculator calculator = new ShapeAreaCalculator();
        calculator.calculateArea(5);
        calculator.calculateArea(3, 7);
        calculator.calculateArea(4.5);
    }
}
