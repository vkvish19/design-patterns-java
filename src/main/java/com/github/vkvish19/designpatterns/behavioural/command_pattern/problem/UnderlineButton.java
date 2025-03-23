package com.github.vkvish19.designpatterns.behavioural.command_pattern.problem;

public class UnderlineButton
{
    private TextEditor textEditor;

    public UnderlineButton(TextEditor textEditor)
    {
        this.textEditor = textEditor;
    }

    public void click()
    {
        textEditor.underlineText();
    }
}
