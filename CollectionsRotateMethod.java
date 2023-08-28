package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsRotateMethod {

	public static void main(String[] args) {
		/*
		 * Collections.rotate(list,position)
		 * minus in antiClockwise\
		 * positive will be in clockwise direction
		 */
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		Collections.rotate(list, -1);
		System.out.println(list);
	      	}
		
	}
