package com.github.vkvish19.designpatterns.creational.abstract_factory_pattern.problem;

public class Application
{
    public static void main(String[] args)
    {
        WindowsButton button = new WindowsButton();
        MacOsScrollBar scrollBar = new MacOsScrollBar();

        button.render();
        scrollBar.scroll();

        // Current code has flaw that we are able to use button of Windows and scroll bar of MacOs. This is not correct.
        // Code needs to make sure that when Windows -> all things must be of windows only.
        // Also, this does not honour Open/Close Principle.
    }
}
