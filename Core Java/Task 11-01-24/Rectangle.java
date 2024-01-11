public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle(double side){
        this.length = side;
        this.width  = side;
    }
    public String toString(){
        String str = String.format("Length: %d \nWidth: %d\n",length,width);
        return str;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,20);
        Rectangle r2 = new Rectangle(10);

        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
    
}
