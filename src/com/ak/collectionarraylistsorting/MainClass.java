package com.ak.collectionarraylistsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		
		//using ArrayLlist for adding
		
		
		ArrayList<BookInfo> arrayList = new ArrayList<BookInfo>();
		
		
		BookInfo book1 = new BookInfo(10, "Kingdom", 245.20, "AK Publishers");
		BookInfo book2 = new BookInfo(40, "Paradise", 265.20, "AK Publishers");
		BookInfo book3 = new BookInfo(100, "Power", 449.20, "AK Publishers");
		

		arrayList.add(book3);
		arrayList.add(book1);
		arrayList.add(book2);
		
		System.out.println(arrayList);
		//for sorting we use collections
		
		Collections.sort(arrayList);
		
		for(BookInfo bookInfo : arrayList) {
			System.out.println(bookInfo);
		}
		
		
	}

}
