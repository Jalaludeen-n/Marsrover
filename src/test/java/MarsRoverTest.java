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
    void positionShouldChange12WFrom12NForInstructionL()
    {
        MarsRover marsRover = new MarsRover(new Coordinate(1,2),Direction.N);
        assertEquals("1 2 W",marsRover.turnLeft());
    }

}
