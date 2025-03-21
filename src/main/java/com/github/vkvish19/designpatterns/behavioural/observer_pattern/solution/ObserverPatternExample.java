package com.github.vkvish19.designpatterns.behavioural.observer_pattern.solution;

/**
 *  Benefits:
 *      1. Loose coupling
 *      2. Scalability
 *      3. Flexibility
 * <p>
 *  Use Case examples:
 *      1. Event Listeners
 *      2. Stock Price Monitoring
 *      3. News Publishing Systems
 *      4. Social Media Notifications
 *      5. Logging Systems
 */
public class ObserverPatternExample
{
    public static void main(String[] args)
    {
        // create a publisher
        WeatherStation station = new WeatherStation();

        // create subscribers
        DisplayDevice device1 = new DisplayDevice("Redmi LED");
        DisplayDevice device2 = new DisplayDevice("Samsung LCD");
        DisplayDevice device3 = new DisplayDevice("Ad screen");
        MobileDevice mobileDevice1 = new MobileDevice();

        // attach
        station.attach(device1);
        station.attach(mobileDevice1);

        // set Temp
        station.setTemperature(25);
        station.setTemperature(32);

        // attach
        station.attach(device2);
        station.attach(device3);

        // detach
        station.detach(device1);

        // set Temp
        station.setTemperature(8);
        station.setTemperature(-2);
    }
}
