package Prototype;

import java.util.HashMap;

public class PrototypePlane {
    HashMap<String, Plane> proto = new HashMap<>();

    public PrototypePlane() {
        proto.put("Hunt", new HuntPlane());
    }

    public Plane getPlane(String type) throws CloneNotSupportedException {
        try {
            return (Plane) proto.get(type).clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
