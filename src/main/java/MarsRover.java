public class MarsRover {
    private static Direction direction;
    Coordinate coordinate;

    public MarsRover(Coordinate coordinate, Direction direction) {
        this.direction = direction;
        this.coordinate = coordinate;
    }

    public String turnRight() {
        return coordinate.getX()+" "+ coordinate.getY()+" "+direction.values()[Math.floorMod(direction.ordinal()+1,4)];
    }

    public String turnLeft() {
        return  coordinate.getX()+" "+coordinate.getY()+" "+direction.values()[Math.floorMod(direction.ordinal()-1,4)];
    }
}
