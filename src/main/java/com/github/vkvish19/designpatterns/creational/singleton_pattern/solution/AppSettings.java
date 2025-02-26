package com.github.vkvish19.designpatterns.creational.singleton_pattern.solution;

public class AppSettings
{
    private static AppSettings instance = null;
    private String dbUrl;
    private String apiKey;

    private AppSettings()
    {
        // read from the config settings file
        dbUrl = "jdbc:mysql://localhost:3306/mydb";
        apiKey = "qwerty@123";
    }

    public static AppSettings getInstance()
    {
        if(instance == null)
        {
            instance = new AppSettings();
        }
        return instance;
    }

    public String getDbUrl()
    {
        return dbUrl;
    }

    public String getApiKey()
    {
        return apiKey;
    }
}
