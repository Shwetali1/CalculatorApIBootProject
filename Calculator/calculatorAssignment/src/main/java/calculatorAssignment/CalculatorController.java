package calculatorAssignment;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/calculatorapi")
public class CalculatorController {

	String response;
	double Result;
	String answer = "answer : ";
	String detail = "detail : ";

	@GetMapping("/Addition")
	public String getAddition(@RequestParam double number1, @RequestParam double number2) {
		Result = number1 + number2;
		response = answer + Result + " , " + detail + number1 + " + " + number2 + " = " + Result;
		return response;
	}
	
	@GetMapping("/Substraction")
	public String getSubstraction(@RequestParam double number1, @RequestParam double number2) {
		Result = number1 - number2;
		response = answer + Result + " , " + detail + number1 + " - " + number2 + " = " + Result;
		return response;
	}
	
	@GetMapping("/Multiplication")
	public String getMultiplication(@RequestParam double number1, @RequestParam double number2) {
		Result = number1 * number2;
		response = answer + Result + " , " + detail + number1 + " * " + number2 + " = " + Result;
		return response;
	}
	
	@GetMapping("/Division")
	public String getdivision(@RequestParam double number1, @RequestParam double number2) {
		Result = number1 / number2;
		response = answer + Result + " , " + detail + number1 + " / " + number2 + " = " + Result;
		return response;
	}
	
	@GetMapping("/square/{number}")
	public String square(@PathVariable double number) {
		Result = number * number;
		response = answer + Result + " , " + detail + "Square of " + number + " = " + Result;
		return response;
	}
	
	@GetMapping("/squareroot/{number}")
	public String squareRoot(@PathVariable double number) {
		Result =Math.sqrt(number);
		response = answer + Result + " , " + detail + "SquareRoot of " + number + " = " + Result;
		return response;
	}
	
	
	@GetMapping("/factorial/{number}")
	public String factorial(@PathVariable int number) {

		Result = 1;

		for (int i = 1; i <= number; i++) {
			Result *= i;
		}

		response = answer + Result + " , " + detail + number + " ! = " + Result;
		return response;
	}
	
	@PostMapping("/min-max")
	public String minmax(@RequestBody List<Integer> numbers) {

		int minNum = numbers.get(0);
		int maxNum = numbers.get(0);
		int i;

		for (i = 1; i < numbers.size(); i++) {
			if (numbers.get(i) > maxNum) {
				maxNum = numbers.get(i);
			}
			if (numbers.get(i) < minNum) {
				minNum = numbers.get(i);
			}
		}

		response = " min : " + minNum + " , max : " + maxNum;
		return response;
	}



}
