public class Square extends Rectangle{
    public Square(){}
    public Square(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    public Square(double side,String color,boolean filled){
        super.setLength(side);
        super.setWidth(side);
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
}
