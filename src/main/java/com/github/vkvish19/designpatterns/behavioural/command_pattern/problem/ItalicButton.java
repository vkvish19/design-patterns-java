package com.github.vkvish19.designpatterns.behavioural.command_pattern.problem;

public class ItalicButton
{
    private TextEditor textEditor;

    public ItalicButton(TextEditor textEditor)
    {
        this.textEditor = textEditor;
    }

    public void click()
    {
        textEditor.italicText();
    }
}
