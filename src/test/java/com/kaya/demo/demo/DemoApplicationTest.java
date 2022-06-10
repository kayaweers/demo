package com.kaya.demo.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SpringBootTest
class DemoApplicationTest {
// createdByParticipant

	int x = 1;

	@Test
	void contextLoads() throws InterruptedException {

		testMethod();


		ArrayList<String> strings = new ArrayList<>();

		new DemoApplication();
		float a = 10.1f;
		float b = 10.1f;
		float c = 10;
		//


		int x = 1;

		int i = x / 2;

		Integer d = 10;
		int e = d;

		if(true){
			//
		} else if(true) {
			//
		} else {
			//
		}

		int[] array1 = {5,0,0};
		int[] array2 = {4, 6};

		System.out.println("compare result: ");
		System.out.println(Arrays.compare(array1, array2));
		System.out.println(Arrays.mismatch(array1, array2));


		float f = Float.NaN;
		System.console();

		// var not allowed as type of array
		// var i[] = new int[2];

		Function<Integer, String> testFunction = (ax) -> Integer.toString(ax);
		Stream.of("1").forEach(as -> System.out.println(as));
		Stream.of("1").forEach((as) -> System.out.println(as));
		Stream.of("1").forEach((String as) -> System.out.println(as));

		IntStream range = IntStream.range(1, 5);
		range.average().getAsDouble();
		//range.collect(Collectors.averagingInt(h->h));
		//range.mapToObj(h->h).collect(Collectors.averagingInt(j->j));

		int[] array = new int[2];

		List test2 = new ArrayList<String>();

		String testString = "test";
		testString.substring(1,1);

		int[][][][] arrayTest = new int[1][][][];
		var doubles = new double[] {1.1, 1.2, 1.3};
		double[] doubles2 = new double[] {1.1, 1.2, 1.3};

		int[] arrayOne = {1, 2};
		int[] arrayTwo = {5};
		int compare = Arrays.compare(arrayOne, arrayTwo);
		System.out.println(compare);


		if(false){
			System.out.println("unreachable");
		}


		StringBuilder stringBuilder = new StringBuilder("123");
		stringBuilder.append(1);
		System.out.println(stringBuilder.toString());
		int[]h=new int[1];

		List integers = new ArrayList<Integer>();

		new ArrayList<>(Set.of("a"));

		Map<Integer, Integer> integerIntegerMap = Map.of(1, 2, 3, 4);


		List<String> testRemoveIf = null;
		// testRemoveIf.removeIf(abcd-> true); //nullpointer

		//6F/8L

		//testRemoveIf.sort((String x, y) -> x + y);

		String name1 = "Ka";
		String name2 = "ya";

		final boolean testbool = false;

		if(testbool){
			System.out.println(testbool);
		}

		final int numberOne = 1;
		if(numberOne != 1){
			System.out.println("unreachable");
		}

	}

	private void testMethod(){
		//lala
	}
}
