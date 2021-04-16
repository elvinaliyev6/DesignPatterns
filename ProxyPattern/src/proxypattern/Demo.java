/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxypattern;

/**
 *
 * @author Elvin Aliyev
 */
public class Demo {
    
    public static void main(String[] args) {
        Image image=new ProxyImage("test 2mb image");
        
        image.display();
        
        System.out.println("");
         //image will not be loaded from disk
      image.display(); 
    }
    
}
