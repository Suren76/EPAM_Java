package homework17DataStructuresTreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Point3DCollection {
    private Map<Point3D, String> point3DMap;

    public Point3DCollection(Map<Point3D, String> point3DMap) {
        this.point3DMap = point3DMap;
    }

    public Point3DCollection() {
        this(new HashMap<>());
    }

    public Map<Point3D, String> getPoint3DMap() {
        return point3DMap;
    }

    public void addPoint3D(Point3D point3D) {
        point3DMap.put(point3D, point3D.getName());
    }

    public TreeMap<Point3D, String> toTreeMap() {
        return new TreeMap<>(point3DMap);
    }

    public Point3DCollection getPoint3DCollectionWithTreeMap() {
        return new Point3DCollection(toTreeMap());
    }

    public Map<String, Point3D> switchKeyValue() {
        Map<String, Point3D> switchedMap = new HashMap<>();

        for (Map.Entry<Point3D, String> entry : getPoint3DMap().entrySet()) {
            switchedMap.put(entry.getValue(), entry.getKey());
        }

        return switchedMap;
    }

    @Override
    public String toString() {
        String strToReturn = "Point3DCollection{" +
                "point3DMap=[";

        for (Map.Entry<Point3D, String> entry : getPoint3DMap().entrySet()) {
            strToReturn += "\n" + entry.getKey() +"="+ entry.getValue();
        }

        strToReturn += "\n" + "]}";

        return strToReturn;
    }
}
