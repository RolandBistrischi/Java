package isp.lab3.exercise4;

public class MyPoint {
    public int x, y, z;

    public MyPoint() {
        x = y = z = 0;
    }

    public MyPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + x +
                "," + y +
                "," + z +
                ')';
    }

    public double distance(int x, int y, int z) {
        double dx = Math.pow((this.x - x), 2);
        double dy = Math.pow((this.y - y), 2);
        double dz = Math.pow((this.y - y), 2);
        return Math.sqrt(dx + dy + dz);
    }

    public double distance(MyPoint another) {
        double dx = Math.pow((this.x - another.x), 2);
        double dy = Math.pow((this.y - another.y), 2);
        double dz = Math.pow((this.y - another.y), 2);
        return Math.sqrt(dx + dy + dz);
    }
}
