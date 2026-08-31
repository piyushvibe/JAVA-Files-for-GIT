class Vehicle {
    String vehicleNumber;
    String vehicleModel;
    String ownerName;

    Vehicle(String vehicleNumber, String vehicleModel, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleModel = vehicleModel;
        this.ownerName = ownerName;
    }

    void displayVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Model: " + vehicleModel);
        System.out.println("Owner Name: " + ownerName);
    }
}

class CarInsurance extends Vehicle {
    double premium;

    CarInsurance(String vehicleNumber, String vehicleModel,
                 String ownerName, double premium) {

        super(vehicleNumber, vehicleModel, ownerName);
        this.premium = premium;
    }

    void displayInsuranceDetails() {
        super.displayVehicleDetails();

        System.out.println("Insurance Type: Car Insurance");
        System.out.println("Insurance Premium: " + premium);
    }
}

class BikeInsurance extends Vehicle {
    double premium;

    BikeInsurance(String vehicleNumber, String vehicleModel,
                  String ownerName, double premium) {

        super(vehicleNumber, vehicleModel, ownerName);
        this.premium = premium;
    }

    void displayInsuranceDetails() {
        super.displayVehicleDetails();

        System.out.println("Insurance Type: Bike Insurance");
        System.out.println("Insurance Premium: " + premium);
    }
}

public class CarExample {
    public static void main(String[] args) {

        CarInsurance car = new CarInsurance(
            "MH12AB1234",
            "Honda City",
            "Piyush",
            15000
        );

        BikeInsurance bike = new BikeInsurance(
            "MH12XY5678",
            "Royal Enfield",
            "Rahul",
            8000
        );

        System.out.println("----- CAR INSURANCE -----");
        car.displayInsuranceDetails();

        System.out.println();

        System.out.println("----- BIKE INSURANCE -----");
        bike.displayInsuranceDetails();
    }
}