public class Shape {
    private String color="red";
    private boolean filled=true;
    public Shape(){
    }
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public String getFilled(){
        if(this.filled) return "filled";
        else return "Not filled";
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }

    @Override
    public String toString(){
       return "A shape with color of "+getColor()+" and "+getFilled();
    }
}
