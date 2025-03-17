package com.github.vkvish19.designpatterns.behavioural.memento_pattern;

import java.util.Stack;

/**
 * Caretaker class: Manages mementos (snapshots of the TextEditor state)
 */
public class Caretaker
{
    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor editor)
    {
        history.push(editor.save());
    }

    public void undo(TextEditor editor)
    {
        if(!history.empty())
        {
            history.pop();
            editor.restore(history.peek());
        }
    }
}
