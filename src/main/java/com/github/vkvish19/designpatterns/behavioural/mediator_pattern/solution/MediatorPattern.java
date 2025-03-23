package com.github.vkvish19.designpatterns.behavioural.mediator_pattern.solution;

/**
 * Scenario: In a chat system, multiple participants communicate through a central
 *          'chat mediator' reducing the need for each participant to be aware of
 *          the others.
 * <p>
 * Example:
 *  -> Mediator: Char server.
 *  -> Colleagues: Chat participants send messages to the mediator, which
 *              distributes them to others.
 * <p>
 *
 *
 * Benefits:-
 *  -> Reduces Complexity: the mediator centralizes communication, reducing direct dependencies
 *                  between objects.
 *  -> Loose Coupling: colleagues only interact with the mediator, making them easier to manage,
 *                  extend, and maintain.
 *  -> Single Responsibility: the mediator handles complex communication logic, allowing colleagues
 *                  focus on their own behavior.
 *  -> Centralized Control: changes to communication rules can be made in the mediator without
 *                  affecting the colleagues.
 * <p>
 *
 *
 * Real World Use Case Examples:
 *  -> Air Traffic Control
 *  -> GUI Component Coordination
 *  -> Workflow Systems
 */
public class MediatorPattern
{
    public static void main(String[] args)
    {
        ChatMediator chatMediator = new ChatRoom();
        User rahul = new User("Rahul", chatMediator);
        User rohit = new User("Rohit", chatMediator);
        User virat = new User("Virat", chatMediator);

        chatMediator.addUser(rahul);
        chatMediator.addUser(rohit);
        chatMediator.addUser(virat);

        virat.sendMessage("Hello Everyone!");
    }
}
