package com.github.vkvish19.designpatterns.structural.proxy_pattern.problem;

public class ImageClientWithoutProxyPattern
{
    public static void main(String[] args)
    {
        // Real image is loaded everytime we create it,
        // which can be inefficient if the image is not always required.

        Image image1 = new RealImage("selfie.png"); // loaded but not used yet. Better to lazy load and then cache.
        Image image2 = new RealImage("group_photo.png"); // this is loaded but not used. Hence, wasting cpu + memory.

        image1.display(); // if we lazy load it here but do not cache, then it will load again in next line.
        image1.display();
    }
}
