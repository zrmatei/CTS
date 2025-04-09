package Factory.classes;

public class SmallFactory extends FactoryPlane{
    @Override
    public Plane createPlane() {
        return new SmallPlane();
    }
}
