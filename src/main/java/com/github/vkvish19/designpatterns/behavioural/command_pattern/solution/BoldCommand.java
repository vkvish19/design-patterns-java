package com.github.vkvish19.designpatterns.behavioural.command_pattern.solution;

public class BoldCommand implements Command
{
    private TextEditor textEditor;

    public BoldCommand(TextEditor textEditor)
    {
        this.textEditor = textEditor;
    }

    @Override
    public void execute()
    {
        textEditor.boldText();
    }
}
