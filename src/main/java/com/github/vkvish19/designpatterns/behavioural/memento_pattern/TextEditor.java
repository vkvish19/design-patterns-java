package com.github.vkvish19.designpatterns.behavioural.memento_pattern;

/**
 * A Text Editor where the user can undo changes, such as text addition, delete or formatting.
 * The editor stores snapshots of its state (text content) after each change, enabling the user to
 * revert to previous state.
 */
public class TextEditor
{
    private String content;

    // save current state of the editor
    public EditorMemento save()
    {
        return new EditorMemento(content);
    }

    // Restore (memento -> update the state of current content)
    public void restore(EditorMemento memento)
    {
        content = memento.getContent();
    }

    public String getContent()
    {
        return content;
    }

    public void write(String text)
    {
        content = text;
    }
}
