package com.designpatterns.abstractfactory;

public class ComputerFactory extends AbstractFactory{
    Automobile getAutomobile(String type) {
        return null;
    }

    Computer getComputer(String type) {
        if (type ==  null) return null;
        else if (type.equalsIgnoreCase("tablet")){
            return new Tablet();
        }
        else if (type.equalsIgnoreCase("laptop")){
            return new Laptop();
        }
        else return null;
    }
}
