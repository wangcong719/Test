package com.test.collection;

import java.util.*;

public class ListTest01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		list.add("1-1");
		list2.add("2-1");
		list2.add("2-2");
		//System.out.println(list);
		list.addAll(list2);   //增加一个集合
		//System.out.println(list);
		//遍历方式1：
		for(String s : list){
			System.out.println(s);
		}
		//遍历方式2：
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		//遍历方式2：
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		Collections.reverse(list);     //实现list集合逆序排列
		System.out.println(list);
		
	}
	
}
