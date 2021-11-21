package com.alfalahsoftech.jdk8;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JDK_8_Test {

	public static void main(String[] args) {
		//get sum of square of given numbers
		int sum = Arrays.asList(1,2,3,5).stream().mapToInt(i->{
			System.out.println(i);
		return  i*i;
		
	}).sum();
		System.out.println("total square sum: "+sum);
		int array[]= {2,3,3,2,1,4};
		int ar[] = {1,2,3,5};
		int sum0 = IntStream.of(array).distinct().sum();
		System.out.println("Sum of unique numbers: "+ sum0);
		
		 int sum2= Arrays.stream(ar).map(i->i*i).sum();
		System.out.println(sum2);
			
	}

}
