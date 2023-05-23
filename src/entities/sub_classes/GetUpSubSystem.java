package entities.sub_classes;

import entities.FlightProcess;

public class GetUpSubSystem extends FlightProcess {
    public GetUpSubSystem() {}

    @Override
    public void flyAway() {
        System.out.println("Les muscles longitudinaux se sont contractés.");
    }
}
