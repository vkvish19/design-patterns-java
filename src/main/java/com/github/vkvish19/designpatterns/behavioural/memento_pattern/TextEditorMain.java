package com.github.vkvish19.designpatterns.behavioural.memento_pattern;

public class TextEditorMain
{
    /**
     * Memento Pattern Structure
     * Components:-
     * 1. Originator: The object whose state needs to be saved and restored. (TextEditor)
     * 2. Memento: Captures and stores the internal state of the originator. (EditorMemento)
     * 3. Caretaker: Manages and stores the mementos, without modifying them. (Caretaker)
     * <p/>
     * Applications where we can use Memento Pattern:
     *  -> where we need undo/redo
     *  -> state restoration
     * <p/>
     *  Use cases:
     *  Games -- saving game state for load/reload functionality.
     *  Document editors -- undo/redo functionality to navigate through document changes.
     */

    public static void main(String[] args)
    {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();  // does History/State mgmt

        editor.write("Hello World");
        caretaker.saveState(editor);

        editor.write("Hello Everyone");
        caretaker.saveState(editor);

        System.out.println("Current state: " + editor.getContent());

        // undo
        caretaker.undo(editor);

        System.out.println("After 1 undo: " + editor.getContent());
    }
}
