public class SquareStrategy implements AbstarctFactory {
    @Override
    public Shape createShape(int size, Point center) {
        return new Square(size, center);
    }
}
