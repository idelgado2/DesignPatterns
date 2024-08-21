import java.util.Scanner;
 
interface Shape {
   void draw();
}
 
interface Color {
   void fill();
}
 
class Rectangle implements Shape {
   public void draw() {
      System.out.println("drawing a rectangle");
   }
}
 
class Square implements Shape {
   public void draw() {
      System.out.println("drawing a square");
   }
}
 
class Red implements Color {
   public void fill() {
      System.out.println("filling with red");
   }
}
 
 
class Blue implements Color {
   public void fill() {
      System.out.println("filling with blue");
   }
}
 
abstract class AbstractFactory {
   abstract Color getColor(String color);
   abstract Shape getShape(String shape) ;
}
 
class ShapeFactory extends AbstractFactory {
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }
      if(shapeType.equalsIgnoreCase("rec")){
         return new Rectangle();
 
      }else if(shapeType.equalsIgnoreCase("squ")){
         return new Square();
      }
      return null;
   }
 
   Color getColor(String color) {
      return null;
   }
}
 
class ColorFactory extends AbstractFactory {
 
   public Shape getShape(String shapeType){
      return null;
   }
 
   Color getColor(String color) {
      if(color == null){
         return null;
      }    
      if(color.equalsIgnoreCase("red")){
         return new Red();
      }else if(color.equalsIgnoreCase("blue")){
         return new Blue();
      }
     
      return null;
   }
}
 
class FactoryProducer {
   public static AbstractFactory getFactory(String choice){
 
      if(choice.equalsIgnoreCase("SHAPE")){
         return new ShapeFactory();
 
      }else if(choice.equalsIgnoreCase("COLOR")){
         return new ColorFactory();
      }
 
      return null;
   }
}
 
public class AbstractFactoryColorDemo {
   public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Shape myShape = null;
        Color myColor = null;
       
        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of shape do you want? (rec / squ)");
        if(userInput.hasNextLine()){
            String typeOfShape = userInput.nextLine();
            myShape = shapeFactory.getShape(typeOfShape);
            if(myShape != null){
                System.out.println("What color do you want to fill shape with? (red / blue)");
                if(userInput.hasNextLine()){
                    String typeOfColor = userInput.nextLine();
                    myColor = colorFactory.getColor(typeOfColor);
                    if(myColor != null){
                        myShape.draw();
                        myColor.fill();
                    }
                }else{
                    System.out.println("Wrong input!");
                }
            }else{
                System.out.println("Wrong input!");
            }
        }
   }
}