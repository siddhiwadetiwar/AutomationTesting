package Abstraction;

public abstract class Car {
    public abstract void stop();
}

class Honda extends Car {
    @Override
    public void stop() {
        System.out.println("Honda::Stop");
        System.out.println("Mechanism to stop the car using brake");
    }
}

