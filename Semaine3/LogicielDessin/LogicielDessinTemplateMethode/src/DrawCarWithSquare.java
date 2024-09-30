public class DrawCarWithSquare extends  DrawCar {
    @Override
    public Shape createShape(int size, Point center) {
        return new Square(size, center);
    }
}
