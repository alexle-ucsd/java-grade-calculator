import static org.junit.Assert.*;
import org.junit.Test;

public class GradeCalculatorTest {

    @Test
    public void testGradeA() {
        assertEquals("A", GradeCalculator.calculateGrade(95));
    }

    @Test
    public void testInvalid() {
        assertEquals("Invalid", GradeCalculator.calculateGrade(150));
    }

    @Test
    public void testBoundary() {
        assertEquals("B", GradeCalculator.calculateGrade(80));
    }

    @Test
    public void testLowBoundary() {
        assertEquals("C", GradeCalculator.calculateGrade(70));
    }
}

