package com.model.templateMethodPattern.hook;

public abstract class CaffeineBeverageWithHook {
    //hook 代表子类可实现也可不实现
    final void prepare() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }
    //hook
    public boolean customerWantsCondiments() {
        return true;
    }

    public abstract void addCondiments();

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public abstract void brew();

    public void boilWater() {
        System.out.println("Boiling water");
    }
}
