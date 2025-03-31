package com.github.vkvish19.designpatterns.structural.proxy_pattern.solution;

public class ProxyImage implements Image
{
    private final String filename;
    private RealImage realImage;

    public ProxyImage(String filename)
    {
        this.filename = filename;
    }

    @Override
    public void display()
    {
        if(realImage == null)
        {
            realImage = new RealImage(filename);    // loaded and cached.
        }
        realImage.display();
    }
}
