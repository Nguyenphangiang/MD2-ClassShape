public class Rectangle extends Shape{
    private double width = 1;
    private double length = 1;

    public Rectangle(){
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        double result = width * length;
        return result;
    }
    public double getPerimeter(){
        double result = (width + length) * 2;
        return result;
    }
    public String toString(){
        return "A rectangle with width = " + getWidth() +
                " length = " + getLength() +
                " , which is a subclass of " + super.toString();
    }
}
