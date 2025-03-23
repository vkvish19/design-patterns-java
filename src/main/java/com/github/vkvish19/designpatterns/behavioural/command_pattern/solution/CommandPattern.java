package com.github.vkvish19.designpatterns.behavioural.command_pattern.solution;

/**
 *  By introducing the Command pattern, we can decouple the actions (bold, italic, underline) from the
 *  UI components (buttons), making the design more flexible and maintainable. The buttons no longer need
 *  to know about the editor directly but instead work with generic Command object.
 */
public class CommandPattern
{
    /** Command Pattern Structure
     *  1. Command: Interface for executing operations.
     *  2. Invoker: Sends the command.
     *  3, Receiver: Performs the operation.
     *  </p>
     *
     *
     *  Command Pattern Benefits
     *  1. Decoupling of Invoker and Receiver
     *  2. Command History and Undo.
     *  3. Task Queuing
     *  4. Extensibility
     *  </p>
     *
     *
     *  Use Case Examples
     *  1. GUI Applications
     *  2. Task Scheduling
     *  3. Undo/Redo functionality
     *  4. Macro Recording
     */
    public static void main(String[] args)
    {
        TextEditor textEditor = new TextEditor();

        // decoupling - one button can do many types of actions, decoupled from the TextEditor!
        Button button = new Button();
        button.setCommand(new BoldCommand(textEditor));
        button.click();

        button.setCommand(new ItalicCommand(textEditor));
        button.click();

        button.setCommand(new ChangeColorCommand(textEditor));
        button.click();

        button.setCommand(new UnderlineCommand(textEditor));
        button.click();
    }
}
