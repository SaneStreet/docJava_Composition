import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinjeTest {

    @Test
    void testLinje(){
        // punktA = (3,0) punktB = (0,4)

        //3. Arrange / Setup
        Punkt punktA = new Punkt(3,0);
        Punkt punktB = new Punkt(0,4);
        Linje linje = new Linje();
        //2. Act / Execution
        double result = linje.length(punktA.getX(), punktA.getY(), punktB.getX(), punktB.getY());

        //1. Assert / Verification
        assertEquals(5, result);

        //Clean-up
    }
}
