package com.github.vkvish19.designpatterns.behavioural.memento_pattern;

// Memento Class: stores the internal state of the Text Editor
public class EditorMemento
{
    private final String content;

    public EditorMemento(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
}
