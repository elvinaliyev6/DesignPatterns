/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Elvin Aliyev
 */
public class CarFactory {
    
    public static Car getShape(String shape){
        
        if("Sedan".equalsIgnoreCase(shape)) return new Sedan();
        else if("hatchback".equalsIgnoreCase(shape)) return new Hatchback();
        
        return null;
    }
    
}
