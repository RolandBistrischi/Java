package isp.lab3.exercise1;

public class /*Exercise1*/ Tree {
    private int height;

    public Tree() {
        this.height = 15;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void grow(int meters) {
        if (meters >= 1) {
            this.height += meters;
        }
    }

    @Override
    public String toString() {
        return "height: " + height;
    }


}
