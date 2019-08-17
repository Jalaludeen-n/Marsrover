import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void directionShouldChangeFromNorthToEast()
    {
        MarsRover marsRover = new MarsRover(new Coordinate(1,2),Direction.N);
        assertEquals("1 2 E", marsRover.turnRight());
    }
    @Test
    void directionShouldChangeFromNorthToWest()
    {
        MarsRover marsRover = new MarsRover(new Coordinate(1,2),Direction.N);
        assertEquals("1 2 W",marsRover.turnLeft());
    }
    @Test
    void positionShouldChangeFrom12NTo13N()
    {
        MarsRover marsRover = new MarsRover(new Coordinate(1,2),Direction.N);
        assertEquals("1 3 N",marsRover.move());
    }
    @Test
    void directionShouldChangeFromNorthToEastForInstructionL()
    {
        MarsRover marsRover = new MarsRover(new Coordinate(1,2),Direction.N);
        assertEquals("1 2 W", marsRover.getFinalPosition("L"));
    }

}
