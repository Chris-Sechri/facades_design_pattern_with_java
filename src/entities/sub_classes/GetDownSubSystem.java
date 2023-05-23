package entities.sub_classes;

import entities.FlightProcess;

public class GetDownSubSystem extends FlightProcess {
    public GetDownSubSystem() {}

    @Override
    protected void flyAway() {
        System.out.println("Les muscles longitudinaux se sont relachés.");
    }
}
