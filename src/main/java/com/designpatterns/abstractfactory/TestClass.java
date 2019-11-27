package com.designpatterns.abstractfactory;

public class TestClass {
    public static void main(String[] args){
        AbstractFactory factory = FactoryProducer.getFactory("AutomobileFactory");
        Automobile automobile = factory.getAutomobile("Car");
        automobile.drive();
    }
}
