package com.github.vkvish19.designpatterns.structural.flyweight_pattern.solution;

import java.util.HashMap;
import java.util.Map;

public class BulletTypeFactory
{
    private static final Map<String, BulletType> bulletTypes = new HashMap<>();

    public static BulletType getBulletType(String color)
    {
        if(!bulletTypes.containsKey(color))
        {
            bulletTypes.put(color, new BulletType(color));
        }
        return bulletTypes.get(color);
    }
}
