package entities.facades;

import entities.Bird;
import entities.FlightProcess;
import entities.sub_classes.GetDownSubSystem;
import entities.sub_classes.GetUpSubSystem;

public class FlightProcessFacade {
    private GetUpSubSystem getUpSubSystem;
    private GetDownSubSystem getDownBehavior;

    public FlightProcessFacade() {
        this.getUpSubSystem = new GetUpSubSystem();
        this.getDownBehavior = new GetDownSubSystem();
    }

    public FlightProcess flightProcessBehavior(Bird bird) {
        if(bird.isRisingUp) {
            return this.getUpSubSystem;
        }else {
            return this.getDownBehavior;
        }
    }
}
