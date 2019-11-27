package com.designpatterns.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType){
        if (factoryType == null) return null;
        else if (factoryType.equalsIgnoreCase("AutomobileFactory")){
            return new AutomobileFactory();
        }
        else if (factoryType.equalsIgnoreCase("ComputerFactory")){
            return new ComputerFactory();
        }
        else return null;
    }
}
