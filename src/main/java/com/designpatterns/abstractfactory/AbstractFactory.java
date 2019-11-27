package com.designpatterns.abstractfactory;

public abstract class AbstractFactory {
    abstract Automobile getAutomobile(String type);
    abstract Computer getComputer(String type);
}
