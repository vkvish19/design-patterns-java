package com.github.vkvish19.designpatterns.creational.abstract_factory_pattern.solution;

public class MacOsUIFactory implements UIFactory
{
    @Override
    public Button createButton()
    {
        return new MacOsButton();
    }

    @Override
    public ScrollBar createScrollBar()
    {
        return new MacOsScrollBar();
    }
}
