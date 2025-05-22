public class Rectangle extends Shape{

    private double width=1.0;
    private double length=1.0;

    public Rectangle(){}
    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        this.width=width;
        this.length=length;
        this.setColor(color);
        this.setFilled(filled);
    }



    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public double getLength(){
        return this.length;
    }

    public void setLength(double length){
        this.width=length;
    }

    public double getArea(double width,double length){
        return width*length;
    }
    public double getPerimeter(double width,double length){
        return width+length;
    }
}
