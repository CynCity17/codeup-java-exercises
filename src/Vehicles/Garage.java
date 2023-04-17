package Vehicles;

public class Garage {

    Vehicle[] vehicles;

    public void alarmCascade(){
        for(Vehicle vehicle : this.vehicles){
            vehicle.makeNoise();
        }
    }






    //TODO: Create a Garage class with two properties. It should have a Vehicle array called vehicles, and an alarmCascade() method that simulates all the vehicles in the array having their alarms go off in sequence. Create a GarageTest class. Create at least three cars and set their names. Put them in an array of vehicles. Instantiate a garage, assign your array to the garage's vehicles property and run the alarmCascade method. Now replace one of the cars with another type of vehicle. Run the alarmCascade method again and note that the vehicles array is polymorphic and can contain different types of vehicles.
}
