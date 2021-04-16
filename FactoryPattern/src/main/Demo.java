
package main;

/**
 *
 * @author Elvin Aliyev
 */
public class Demo {
    public static void main(String[] args) {
        Car c=CarFactory.getShape("hatchback");
        Car c2=CarFactory.getShape("Sedan");
        
        System.out.println(c.getShape());
        System.out.println(c2.getShape());
                
    }
}
