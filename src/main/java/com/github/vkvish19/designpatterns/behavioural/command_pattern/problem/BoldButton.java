package com.github.vkvish19.designpatterns.behavioural.command_pattern.problem;

public class BoldButton
{
    private TextEditor textEditor;

    public BoldButton(TextEditor textEditor)
    {
        this.textEditor = textEditor;
    }

    public void click()
    {
        textEditor.boldText();
    }
}
