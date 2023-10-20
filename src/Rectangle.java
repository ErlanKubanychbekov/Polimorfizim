public class Rectangle extends Figura{
    private double lenght;
    private  double width;
     Figura figura = new Figura();

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public Rectangle() {
    }

    public Rectangle(String name, double lenght, double width){
        super(name);
        this.lenght = lenght;
        this.width  = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", width=" + width +
                '}';
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public void getFigurName(){
        System.out.println("Name-> "+ figura.getName() + "Lenght-> "+ lenght + "Width-> "+width);
    }
}
