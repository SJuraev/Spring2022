package practice.circle_classes;

public class Rectangle {
    /*
    Make a Rectangle Class and use it in TestRectangle main class. To get more details you can check
     the Circle class Example how to solve it. Please use the methods and constructors are given below:
     */
    public float length;
    public float width;

    public Rectangle (float length, float width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        double area = length * width;
        return  area;
    }

    public double getPerimetr(){
        double perimetr =2 * (length + width);
        return perimetr;
    }
}
