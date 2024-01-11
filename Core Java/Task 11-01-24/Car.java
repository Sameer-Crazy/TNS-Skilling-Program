public class Car {
    private String make;
    private String model;
    private int year;

    public Car(){
        this.make = "Nissan";
        this.model = "GTR";
        this.year = 2000;
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String toString(){
        String str = String.format("Make: %s \nModel: %s \nYear: %s\n",make,model,year);
        return str;
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Toyota","Supra",2003);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
