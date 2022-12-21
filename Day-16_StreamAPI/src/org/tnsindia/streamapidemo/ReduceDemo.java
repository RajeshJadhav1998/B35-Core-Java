package org.tnsindia.streamapidemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//demo on reduce

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> inList = Arrays.asList(72,18,72,75,88);
		Optional<Integer> result = inList.stream() .reduce((a,b)->(a>b)?a:b);
		if(result.isPresent()) {
			System.out.println("Result : "+result.get());
		}
	}

}
