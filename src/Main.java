import entities.Bird;
import entities.FlightProcess;
import entities.facades.FlightProcessFacade;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird(true);
        FlightProcessFacade flightProcessFacade = new FlightProcessFacade();

        FlightProcess flightProcess = flightProcessFacade.flightProcessBehavior(bird);

        bird.setFlightProcess(flightProcess);
        bird.execute();
    }
}