class Vehicle {
    public void DisplayVehicle() {
        System.out.println("This is a Vehicle");
    }
}

class Bike extends Vehicle {
    public void DisplayBike() {
        System.out.println("This is a Bike");
    }

}

public class SingleInheritance {
    public static void main(String[] args) {
        Bike bikeobj = new Bike();
        bikeobj.DisplayBike();
        bikeobj.DisplayVehicle();
    }
}
