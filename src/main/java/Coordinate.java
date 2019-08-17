public class Coordinate {
    private int X;
    private int Y;
    public Coordinate(int X, int Y) {
                  this.X=X;
                  this.Y=Y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void moveX(int plusX) {
        X += plusX;
    }

    public void moveY(int plusY) {
        Y += plusY;
    }
}
