package com.github.vkvish19.designpatterns.structural.proxy_pattern.solution;

/**
 *  Proxy Pattern Benefits:
 *  1. Lazy Initialization: Objects are loaded only when necessary, saving memory and CPU cycles.
 *  2. Access Control: You can control access to the real objects (e.g., based on user permissions).
 *  3. Additional Behavior: Proxies can add additional functionalities like logging, access control,
 *              or caching without modifying the real object.
 *  4. Separation of Concerns: The real object only deals with its core responsibilities,
 *              while proxy handles ancillary operations like initialization or security.
 */
public class ImageClientWithProxyPattern
{
    public static void main(String[] args)
    {
        // Real image is loaded everytime we create it,
        // which can be inefficient if the image is not always required.

        Image image1 = new RealImage("dog.png"); // not loaded and not used yet.
        Image image2 = new RealImage("cat.png"); // not created and not loaded as well.

        // This image is loaded lazily when needed, saving time and resources if the image is never displayed.
        image1.display(); // (create realImage + load) + display --> 1st time will be slow.
        image1.display(); // display --> will be fast as it will take from cache.
    }
}
