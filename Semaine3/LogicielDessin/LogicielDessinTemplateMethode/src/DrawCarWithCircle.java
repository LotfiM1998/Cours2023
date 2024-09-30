public class DrawCarWithCircle extends DrawCar {
    @Override
    public Shape createShape(int size, Point center) {
        return new Circle(size, center);
    }
}
