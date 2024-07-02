package com.xworkz.dress.boot;

public class DressRunner {
	
	public static void main(String[] args) {
		String num= "7892";
		Integer num2 = Integer.valueOf(num);
		System.out.println("the value=="+num2);
		
		String cost="1000";
		Short cost2= Short.valueOf(cost);
		System.out.println("cost=="+cost2);
		
		String gst="100";
		Byte gst2=Byte.valueOf(gst);
		System.out.println("gst"+gst2);
		
		String a="true";
		Boolean a2= Boolean.parseBoolean(a);
		System.out.println("a2"+a2);
		
		String phone ="1234567891";
		Long phone2=Long.parseLong(phone);
		System.out.println("phone="+phone2);
		
		String price = "1234";
		Float price2= 	Float.parseFloat(price);
		System.out.println("price"+price2);
		
		
		String cgst = "1234";
		Double cgst2= 	Double.parseDouble(cgst);
		System.out.println("price"+cgst2);
		
		String alpha="character";
		Character alpha2=Character.valueOf(64);
	}

}
