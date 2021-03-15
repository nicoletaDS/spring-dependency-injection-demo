package vehicles;

import parts.Engine;

public class Vehicle {

    private Engine engine;

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public void runVehicle() {
        engine.startEngine();
        System.out.println("Vehicle is running!");
    }
}
