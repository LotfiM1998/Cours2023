public class Main {
    public static  void main(String[] args) {
    DrawCar d = new DrawCar();
    d.draw(100,new SquareStrategy());
    d.draw(100,new CircleStrategy());

    }
}
