package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class GettingStartedTest {

	GettingStarted g;
	
	@BeforeEach
	public void setup() {
		g = new GettingStarted();
	}
	
    @Test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

    @Test
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void addFiveToMinus20() {
       int result = new GettingStarted().addFive(-20);
       Assertions.assertEquals(-15,result);
    }
}
