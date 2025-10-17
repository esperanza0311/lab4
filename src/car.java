public class Car {
    String brand;
    String model;
    int year;
    public void displayInfo(){
        System.out.println("BRAND"+brand+"MODEL"+model+"YEAR"+year);
    }
    Engine engine=new Engine(200);
    

    public static void main(String[] args) {
        Car car=new Car();
        car.brand="mercedes-benz";
        car.model="c-200";
        car.year="2024";


    }
}
