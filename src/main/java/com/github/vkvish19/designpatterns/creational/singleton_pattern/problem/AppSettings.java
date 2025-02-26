package com.github.vkvish19.designpatterns.creational.singleton_pattern.problem;

public class AppSettings
{
    private String dbUrl;
    private String apiKey;

    public AppSettings()
    {
        // read from the config settings file
        dbUrl = "jdbc:mysql://localhost:3306/mydb";
        apiKey = "qwerty@123";
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
