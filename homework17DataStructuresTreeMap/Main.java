package homework17DataStructuresTreeMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Point3DCollection point3DCollection = new Point3DCollection();

        for (int i = 1; i < 5; i++) {
            point3DCollection.addPoint3D(
                    new Point3D(i, 3, 5, "red", "yo i'm name " + i)
            );
        }

        // same items with different names
        point3DCollection.addPoint3D(
                new Point3D(0, 3, 5, "red", "yo i'm name 0.1")
        );
        point3DCollection.addPoint3D(
                new Point3D(0, 3, 5, "red", "yo i'm name 0.2")
        );

        System.out.println("---- original Map ----");
        System.out.println(point3DCollection);
        System.out.println("---- Point3D Collection With TreeMap ----");
        System.out.println(point3DCollection.getPoint3DCollectionWithTreeMap());
        System.out.println("---- switched Map key value ----");
        point3DCollection.switchKeyValue().entrySet().forEach(System.out::println);
    }
}
