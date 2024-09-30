public class CircleStrategy implements AbstarctFactory {
    @Override
    public Shape createShape(int size, Point center) {
        return new Circle(size, center);
    }
}
