public class MarsRover {
    private static Direction direction;
    Coordinate coordinate;

    public MarsRover(Coordinate coordinate, Direction direction) {
        this.direction = direction;
        this.coordinate = coordinate;
    }

    public String turnRight() {
        direction = direction.values()[Math.floorMod(direction.ordinal()+1,4)];
        return coordinate.getX()+" "+ coordinate.getY()+" "+direction;
    }

    public String turnLeft() {
        direction = direction.values()[Math.floorMod(direction.ordinal()-1,4)];
        return  coordinate.getX()+" "+coordinate.getY()+" "+direction;
    }

    public String move() {
        coordinate.moveX(direction.plusX);
        coordinate.moveY(direction.plusY);
        return coordinate.getX()+" "+coordinate.getY()+" "+direction;
    }

    public String getFinalPosition(String instructions) {
        for (char instruction : instructions.toCharArray()) {
            if (instruction == 'L')
                turnLeft();
            if (instruction == 'R')
                turnRight();
            if (instruction == 'M')
                move();
        }
        return coordinate.getX()+" "+coordinate.getY()+" "+direction;
    }
}
