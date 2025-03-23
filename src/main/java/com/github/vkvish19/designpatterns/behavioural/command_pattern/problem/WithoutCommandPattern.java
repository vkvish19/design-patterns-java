package com.github.vkvish19.designpatterns.behavioural.command_pattern.problem;

public class WithoutCommandPattern
{
    public static void main(String[] args)
    {
        TextEditor textEditor = new TextEditor();
        BoldButton boldButton = new BoldButton(textEditor);
        ItalicButton italicButton = new ItalicButton(textEditor);
        UnderlineButton underlineButton = new UnderlineButton(textEditor);

        boldButton.click();
        italicButton.click();
        underlineButton.click();

    }
}
