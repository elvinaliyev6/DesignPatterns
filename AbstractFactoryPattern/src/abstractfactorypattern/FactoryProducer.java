/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypattern;

/**
 *
 * @author Elvin Aliyev
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        } else if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        }
        return null;
    }
}
