public class Circle extends Shape{
    private double radius=1.0;
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        this.radius=radius;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(double radius){
        return 3.1416*radius*radius;
    }
    public double getPerimeter(double radius){
        return 2*3.1416*radius;
    }
}
