package com.test.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * Iterator中定义了三个方法：
 * hasNext()  如果仍有元素可以迭代，则返回true；
 * next()   返回迭代的下一个元素
 * remove()  从迭代器指向的 collection 中移除迭代器返回的最后一个元素（可选操作
 */

public class IteratorTest {

	public static void main(String[] args) {
		Collection coll = new ArrayList();
		coll.add("abc0");
	    coll.add("abc1");
	    coll.add("abc2");
		
	  //--------------方式1----------------------
	    Iterator it = coll.iterator();
	    while(it.hasNext()){
	    	System.out.println(it.next());
	    }
	  //---------------方式2用此种----------------------
	    for(Iterator it2 =coll.iterator();it2.hasNext(); ){
	    	System.out.println(it2.next());
	    }
	    
	}
}
