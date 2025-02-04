package homework17DataStructuresTreeMap;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Point3D implements Comparable<Point3D>{
    // coordinates
    private int x;
    private int y;
    private int z;

    private String color;
    private String name;

    public Point3D(int x, int y, int z, String color, String name) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.color = color;
        this.name = name;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return getX() == point3D.getX() && getY() == point3D.getY() && getZ() == point3D.getZ() && Objects.equals(getColor(), point3D.getColor()) && Objects.equals(getName(), point3D.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getZ(), getColor(), getName());
    }

    @Override
    public int compareTo(Point3D otherPoint3D) {
        return (
                Integer.compare(x, otherPoint3D.getX()) +
                Integer.compare(y, otherPoint3D.getY()) +
                Integer.compare(z, otherPoint3D.getZ()) +
                color.compareTo(otherPoint3D.getColor())
        );
    }

    static int testCompareTo() {
        Point3D point3D = new Point3D(1, 3, 5, "red", "yo");
        Point3D point3D1 = new Point3D(1, -3, -15, "red", "yo 07");

        return point3D.compareTo(point3D1);
    }

    public static void main(String[] args) {
        System.out.println(testCompareTo());;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
