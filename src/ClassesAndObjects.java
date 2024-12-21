class Car {
    String brand;
    int speed;

    void DisplayCar() {
        System.out.println("Brand name: " + brand);
        System.out.println("Speed is:" + speed);
    }
}


public class ClassesAndObjects {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.brand = "Ferrari";
        mycar.speed = 250;
        mycar.DisplayCar();
    }

}