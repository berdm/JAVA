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
public class AbstractFactoryPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //get shape factory
        
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        
        //get an objcet of shape circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        //call draw metod of shape circle
        shape1.draw();
        
        //get an object of shape circle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        //call draw metod of rectangle
        shape2.draw();
        
        //
        Shape shape3 = shapeFactory.getShape("SQUARE");
        //
        shape3.draw();
        
        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        
        //get an object of color red
        Color color1 = colorFactory.getColor("RED");
        //call fill metod red
        color1.fill();
        
        //get an object of color green
        Color color2 = colorFactory.getColor("GREEN");
        //call fill metod green
        color2.fill();
        
        //get an object of color blude
        Color color3 = colorFactory.getColor("BLUE");
        //call fill metod blue
        color3.fill();
        
    }
    
}
