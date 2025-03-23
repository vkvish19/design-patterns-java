package com.github.vkvish19.designpatterns.behavioural.command_pattern.solution;

public class ChangeColorCommand implements Command
{
    private TextEditor textEditor;

    public ChangeColorCommand(TextEditor textEditor)
    {
        this.textEditor = textEditor;
    }

    @Override
    public void execute()
    {
        textEditor.changeColor();
    }
}
