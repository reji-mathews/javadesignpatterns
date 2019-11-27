package com.designpatterns.abstractfactory;

public class AutomobileFactory extends AbstractFactory{

    Automobile getAutomobile(String type) {
        if (type == null) return null;
        else if (type.equalsIgnoreCase("Car")){
            return new Car();
        }
        else if (type.equalsIgnoreCase("Bus")){
            return new Bus();
        }
        else return null;
    }

    Computer getComputer(String type) {
        return null;
    }
}
