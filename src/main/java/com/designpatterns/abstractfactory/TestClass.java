package com.designpatterns.abstractfactory;

public class TestClass {
    public static void main(String[] args){
        AbstractFactory automobileFactory = FactoryProducer.getFactory("AutomobileFactory");
        Automobile automobile = automobileFactory.getAutomobile("car");
        automobile.drive();

        AbstractFactory computerFactory = FactoryProducer.getFactory("ComputerFactory");
        Computer computer = computerFactory.getComputer("tablet");
        computer.process();
    }
}
