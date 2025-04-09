package Factory.classes;

public class HuntFactory extends FactoryPlane{
    @Override
    public Plane createPlane() {
        return new HuntPlane();
    }
}
