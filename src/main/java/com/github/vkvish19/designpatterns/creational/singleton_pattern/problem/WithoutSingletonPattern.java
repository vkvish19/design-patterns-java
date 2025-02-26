package com.github.vkvish19.designpatterns.creational.singleton_pattern.problem;

public class WithoutSingletonPattern
{
    public static void main(String[] args)
    {
        AppSettings appSettings1 = new AppSettings();
        AppSettings appSettings2 = new AppSettings();

        String key1 = appSettings1.getApiKey();
        String key2 = appSettings2.getApiKey();

        System.out.println(String.format("Key1: '%s', Key2: '%s'", key1, key2));

        // Extra memory taken by each instance.
        System.out.println("Are both same objects: " + (appSettings1==appSettings2));
    }
}
