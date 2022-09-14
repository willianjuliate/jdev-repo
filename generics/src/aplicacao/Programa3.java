package aplicacao;

import entities.Circle;
import entities.Rectangle;
import entities.iShape;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author willian
 */
public class Programa3 {
    public static void main(String[] args) {
        List<iShape> forma = new ArrayList<>();
        forma.add(new Circle(16.0));
        forma.add(new Rectangle(10.0,20.0));
        
        List<Circle> circle = new ArrayList<>();
        circle.add(new Circle(16.0));
        circle.add(new Circle(15.0));
        circle.add(new Circle(18.0));
        
        System.out.println("Total area: "+ totalArea(circle));
        System.out.println("Total area: "+ totalArea(forma));
        
    }
    
    public static double totalArea(List<? extends iShape> list) {
        double sum = 0.0;
        for (iShape shape : list) {
            sum += shape.area();
        }
        return sum;
    }
    
}
