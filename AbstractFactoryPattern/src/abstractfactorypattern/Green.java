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
public class Green implements Color{
  @Override
  public void fill() {
   System.out.println("Green was filled");
  }
}
