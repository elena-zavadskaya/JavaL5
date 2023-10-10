public class Point3d {
    private double x;
    private double y;
    private double z;

    public Point3d (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX () {
        return x;
    }
    public double getY () {
        return y;
    }
    public double getZ () {
        return z;
    }

    public void setX ( double val) {
        x = val;
    }
    public void setY ( double val) {
        y = val;
    }
    public void setZ ( double val) {
        z = val;
    }

    public boolean comparePoints(Point3d otherObj) { // Сравниваем точки на идентичность.
        if(x == otherObj.getX() && y == otherObj.getY() && z == otherObj.getZ())
            return true;
        else return false;
    }

    // Расстояние между точками: V((x2-x1)^2 + (y2-y1)^2 + (z2-z1)^2)
    public double distanceTo(Point3d otherObj) {
        return Math.sqrt(Math.pow(otherObj.getX() - x,2)+Math.pow(otherObj.getY() - y,2)+Math.pow(otherObj.getZ() - z,2));
    }
}
