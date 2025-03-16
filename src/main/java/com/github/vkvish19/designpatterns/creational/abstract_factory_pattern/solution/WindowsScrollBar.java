package com.github.vkvish19.designpatterns.creational.abstract_factory_pattern.solution;

public class WindowsScrollBar implements ScrollBar
{
    @Override
    public void scroll()
    {
        System.out.println("Windows Scroll bar");
    }
}
