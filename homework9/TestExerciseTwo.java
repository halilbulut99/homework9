package homework9;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import fmi.informatics.extending.Student;
import junit.framework.Assert;

class TestExerciseTwo {

	@Test
	void test() {
		
		ArrayList<String> fruits = new ArrayList<String>();

		
		Stream.of("apple", "banana", "cherries", "grapefruit").map(String::toUpperCase).collect(Collectors.toList())
		.forEach(System.out::println);	
		
		
		Assert.assertEquals(fruits.get(1),"cherries");
		
	}

}
