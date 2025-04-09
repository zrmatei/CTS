package Prototype;

public class HuntPlane extends Plane{
    String type;
    public HuntPlane() {
        this.type = "Hunting Plane";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        HuntPlane clone = (HuntPlane) super.clone();
        clone.type = type;
        return clone;
    }
}
