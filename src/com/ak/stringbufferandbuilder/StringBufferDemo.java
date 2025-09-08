package com.ak.stringbufferandbuilder;

public class StringBufferDemo {

	public static void main(String[] args) {

		//String Buffer is mutable
		
		StringBuffer str1 = new StringBuffer("programmer");
		
		str1.append(" Aravind");
		System.out.println(str1);

		//str1.insert(0, "Hi ");
		//str1.replace(0, 4, "lll");
		//cannot change the datatype of original string buffer, we should store it in String variable and converts using tostring method
		//String str3 = str1.toString();
		
		//String str2 = str3;
		
		System.out.println(str1);

		
	
		

	}

}
