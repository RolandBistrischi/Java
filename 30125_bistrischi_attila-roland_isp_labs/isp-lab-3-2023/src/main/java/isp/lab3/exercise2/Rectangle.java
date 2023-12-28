package isp.lab3.exercise2;

public class Rectangle {

    private int lenght;
    private int width;
    private String color;

    public Rectangle() {
        this.lenght = 2;
        this.width = 1;
        this.color = "red";
    }

    public Rectangle(int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }

    public Rectangle(int lenght, int width, String color) {
        this.lenght = lenght;
        this.width = width;
        this.color = color;
    }

    public int getLength() {
        return lenght;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public int getPerimeter() {
        return 2 * lenght + 2 * width;
    }

    public int getArea() {
        return lenght * width;
    }

    @Override
    public String toString() {
        return "Length: " + getLength() + ", Width: " + getWidth() + ", Color: " + getColor() + ", Perimeter: " + getPerimeter() + ", Area: " + getArea();
    }

}
