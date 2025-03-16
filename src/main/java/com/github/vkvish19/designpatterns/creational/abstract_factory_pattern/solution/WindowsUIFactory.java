package com.github.vkvish19.designpatterns.creational.abstract_factory_pattern.solution;

public class WindowsUIFactory implements UIFactory
{
    @Override
    public Button createButton()
    {
        return new WindowsButton();
    }

    @Override
    public ScrollBar createScrollBar()
    {
        return new WindowsScrollBar();
    }
}
