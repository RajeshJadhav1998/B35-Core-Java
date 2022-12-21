package org.tnsindia.collectiondemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer>obj=new PriorityQueue<>();
		obj.add(12);
		obj.add(11);
		obj.add(15);
		obj.add(13);
		System.out.println(obj);
	}

}
