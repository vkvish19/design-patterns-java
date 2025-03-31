package com.github.vkvish19.designpatterns.structural.facade_pattern.problem;

// microservice for UserManagement
public class UserService
{
    public String getUserDetails(String userId)
    {
        // simulate fetching user details
        return "User details for user Id: " + userId;
    }
}
