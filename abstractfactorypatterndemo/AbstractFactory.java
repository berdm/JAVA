/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypatterndemo;

/**
 *
 * @author BUKET
 */
public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);
    
   abstract Color getColor(String colorType);
    
}
