package calculatorAssignment;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class calculatorAssignmentcontrollerTest {
	
	@InjectMocks
	 private CalculatorController calculatorcontroller;
	
	
	@Test
	public void getaddition() {
		String res=calculatorcontroller.getAddition(2,7);
		assertEquals(9,res);
	}
	
	@Test
	public void getSubstraction() {
		String res=calculatorcontroller.getSubstraction(25, 20);
		assertEquals(5,res);
	}
	
	@Test
	public void getMultiplication() {
		String res=calculatorcontroller.getMultiplication(4, 4);
		assertEquals(16,res);
	}
	
	@Test
	public void getdivision() {
		String res=calculatorcontroller.getdivision(27, 3);
		assertEquals(9, res);
	}
	
	@Test
	public void getsquare() {
		String res = calculatorcontroller.square(7.0);
		assertEquals(49.0,res);
	}
	
	@Test
	public void squareRoot() {
		String res = calculatorcontroller.squareRoot(25.0);
		assertEquals(5.0, res);
	}
	
	@Test
	public void factorial() {
		String res = calculatorcontroller.factorial(4);
		assertEquals(24, res);
	}
	
	@Test
	public void minmax() {
		List<Integer> numbers= new ArrayList<>(Arrays.asList(5,2,3,15));
		String res=calculatorcontroller.minmax(numbers);
		assertNotNull(res);
	}

}
