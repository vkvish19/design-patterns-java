package com.github.vkvish19.designpatterns.creational.abstract_factory_pattern.solution;

public class Application
{
    private Button button;
    private ScrollBar scrollBar;

    public Application(UIFactory uiFactory)
    {
        this.button = uiFactory.createButton();
        this.scrollBar = uiFactory.createScrollBar();
    }

    public void renderUI()
    {
        button.render();
        scrollBar.scroll();
    }

    public static void main(String[] args)
    {
        UIFactory winUiFactory = new WindowsUIFactory();
        Application application = new Application(winUiFactory);
        application.renderUI();

        UIFactory macOsUiFactory = new MacOsUIFactory();
        application = new Application(macOsUiFactory);
        application.renderUI();
    }
}
