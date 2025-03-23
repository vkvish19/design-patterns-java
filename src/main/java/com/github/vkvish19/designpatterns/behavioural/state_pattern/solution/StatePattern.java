package com.github.vkvish19.designpatterns.behavioural.state_pattern.solution;

/**
 * Structure:-
 *  -> Context: Holds a reference to the current state.
 *  -> State: Interface for state-specific behavior.
 *  -> Concrete State: specific implementations of the 'State' interface that
 *              represent a particular state of the context object.
 * <p>
 *
 * Use Case Example:-
 *    1. UI Navigation ->
 *          Scenario: A mobile app UI where the navigation behavior changes based on
 *              whether the user is logged in or not.
 *              States: LoggedInState, LoggedOutState
 *              Context: The app's navigation system switches between these states.
 *    2. UI Components -> Buttons that change behavior based on state (enabled, disabled, pressed).
 *    3. Vending Machines -> States like waiting for money, dispensing product, or out of stock.
 *    4. TCP Connections -> Changing behavior based on connection state (listening, connected, closed).
 */
public class StatePattern
{
    public static void main(String[] args)
    {
        DirectionService directionService = new DirectionService(new Car());
        System.out.println("ETA (in mins): " + directionService.getETA());
        System.out.println(directionService.getDirections());

        directionService.setTransportationMode(new Walking());
        System.out.println("ETA (in mins): " + directionService.getETA());
        System.out.println(directionService.getDirections());
    }
}
