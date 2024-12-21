class VehicleModel {
    public void DisplayVehicle() {
        System.out.println("This is a super Vehicle");
    }
}

class Car1 extends VehicleModel {
    public void DisplayCar() {
        System.out.println("This is a Car");
    }
}

class Bike1 extends Car1 {
    public void DisplayBike() {
        System.out.println("This is a bike");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Bike1 bike1obj = new Bike1();
        bike1obj.DisplayBike();
        bike1obj.DisplayCar();
        bike1obj.DisplayVehicle();
    }
}
