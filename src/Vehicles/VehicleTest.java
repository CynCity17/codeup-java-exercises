package Vehicles;

public class VehicleTest {

    public static void main(String[] args) {
//        Beetle beetle = new Beetle();
//        beetle.setName("Beetle");
//        beetle.makeNoise();
//        beetle.breakingDownNoise();
//        ElectricCar electricCar = new ElectricCar();
//        electricCar.setName("Electric Car");
//        ClassicCamaro classicCamaro = new ClassicCamaro();
//        classicCamaro.setName("Classic Camaro");
//        classicCamaro.makeNoise();

        Garage garage = new Garage();
        garage.vehicles = new Vehicle[3];
        garage.vehicles[0] = new Beetle();
        garage.vehicles[0].setName("Beetle");
        garage.vehicles[1] = new ElectricCar();
        garage.vehicles[1].setName("Electric Car");
        garage.vehicles[2] = new ClassicCamaro();
        garage.vehicles[2].setName("Classic Camaro");
        garage.alarmCascade();

    }
}
