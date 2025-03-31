package com.github.vkvish19.designpatterns.structural.decorator_pattern.solution;

/**
 *  Advantages:
 *      -> Flexible
 *      -> Scalable
 *      -> Obeys Single Responsibility principle
 *      -> Obeys Open/Close principle
 *      -> More Dynamic (can add during runtime)
 *      -> Combinatorial freedom (mix and match in any order/combination)
 */
public class PizzaAppWithDecoratorPattern
{
    public static void main(String[] args)
    {
        // Basic Pizza
        Pizza pizza = new BasicPizza();

        // Add toppings
        pizza = new CornDecorator(pizza);
        pizza = new OliveDecorator(pizza);

        System.out.println("Pizza Contents: " + pizza.getDescription());
        System.out.println("Pizza Cost: Rs." + pizza.getCost() + "/-");

        // make it Cheese burst
        pizza = new CheeseDecorator(pizza);

        System.out.println("\nPizza Contents: " + pizza.getDescription());
        System.out.println("Pizza Cost: Rs." + pizza.getCost() + "/-");
    }
}
