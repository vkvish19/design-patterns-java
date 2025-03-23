package com.github.vkvish19.designpatterns.behavioural.command_pattern.solution;

public class UnderlineCommand implements Command
{
    private TextEditor textEditor;

    public UnderlineCommand(TextEditor textEditor)
    {
        this.textEditor = textEditor;
    }

    @Override
    public void execute()
    {
        textEditor.underlineText();
    }
}
