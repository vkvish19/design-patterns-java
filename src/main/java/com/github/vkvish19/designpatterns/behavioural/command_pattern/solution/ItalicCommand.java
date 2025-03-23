package com.github.vkvish19.designpatterns.behavioural.command_pattern.solution;

public class ItalicCommand implements Command
{
    private TextEditor textEditor;

    public ItalicCommand(TextEditor textEditor)
    {
        this.textEditor = textEditor;
    }

    @Override
    public void execute()
    {
        textEditor.italicText();
    }
}
