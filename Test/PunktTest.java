import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PunktTest {

    @Test
    void testPunkt(){
        // x = 3, y = 2

        //3. Arrange / Setup
        double x = 3;
        double y = 2;
        Punkt punkt = new Punkt(x, y);

        //2. Act / Execute
        double result = punkt.getX();
        double result1 = punkt.getY();

        //1. Assert / Verification
        assertEquals(3, result);
        assertEquals(2, result1);

        //4. Clean-cup
    }

    @Test
    void testSetX(){
        //x = 5

        //Arrange
        double x = 5;
        double y = 0;
        Punkt punkt = new Punkt(x,y);

        //Act
        punkt.setX(4);
        double result = punkt.getX();

                //Assert
        assertEquals(4, result);

        //Cleanup
    }

    @Test
    void testSetY(){
        //y = 8

        //Arrange
        double x = 0;
        double y = 0;
        Punkt punkt = new Punkt(x,y);

        //Act
        punkt.setY(7);
        double result = punkt.getY();

                //Assert
        assertEquals(7, result);

        //Clean-up
    }

    @Test
    void testGetX(){
        //x = 3

        //Arrange
        Punkt punkt = new Punkt(3,0);
        //Act
        double result = punkt.getX();
        //Assert
        assertEquals(3, result);
        //Cleanup
    }

    @Test
    void testGetY(){
        //y = 4

        //Arrange
        Punkt punkt = new Punkt(0, 4);
        //Act
        double result = punkt.getY();
        //Assert
        assertEquals(4, result);
        //Clean-up
    }
}
