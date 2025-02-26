package com.github.vkvish19.designpatterns.creational.singleton_pattern.solution;

public class SingletonPattern
{
    public static void main(String[] args)
    {
        AppSettings appSettings1 = AppSettings.getInstance();
        AppSettings appSettings2 = AppSettings.getInstance();

        String key1 = appSettings1.getApiKey();
        String key2 = appSettings2.getApiKey();

        System.out.println(String.format("Key1: '%s', Key2: '%s'", key1, key2));

        // Only one instance.
        System.out.println("Are both same objects: " + (appSettings1==appSettings2));

    }
}
