package com.java8.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListDuplicates {
	
	public static void main(String[] args) {
		List<String> list1= new ArrayList<String>(Arrays.asList("Suji","Ragul","Ragul","Diya","Suji"));
		
		//Set<String> set = new HashSet<>(list1);
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(int i=0;i<list1.size();i++)
		{
	
			if(map.containsKey(list1.get(i)))
			{
			
				map.put(list1.get(i), map.get(list1.get(i))+ 1);
					
					
			}
			else
			{
				map.put(list1.get(i), 1);
			}
		}
		// displaying the occurrence of elements in the arraylist
        for (Map.Entry<String, Integer> val : map.entrySet()) {
        	if(val.getValue()>=2)
        	{
            System.out.println("Element " + val.getKey() + " "
                               + "occurs"
                               + ": " + val.getValue() + " times");
        }
        }
	}
}


