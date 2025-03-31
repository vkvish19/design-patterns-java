package com.github.vkvish19.designpatterns.structural.decorator_pattern.problem;

/**
 *  Problems:
 *      -> Scalability
 *      -> Maintainability
 *      -> Class Explosion
 *      -> Testing also becomes headache
 */
public class PizzaApp
{
    public static void main(String[] args)
    {
        Pizza pizza = new CheeseCornPizza();
        System.out.println("Contents: " + pizza.getDescription());
        System.out.println("Cost: Rs." + pizza.getCost() + "/-");
    }
}
