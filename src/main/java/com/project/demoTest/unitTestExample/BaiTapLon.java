package com.project.demoTest.unitTestExample;

public class BaiTapLon {
	static int maxValue = 100;
	static int minValue = -100;
	static  boolean isValidValue (int a1, int b1, int a2, int b2){
		if(a1 < minValue || a1 > maxValue || b1 < minValue || b1 > maxValue ||
				a2 < minValue || a2 > maxValue || b2 < minValue || b2 > maxValue ){
			return false;
		}
		return true;
	}
	static String Check (int a1, int b1, int a2, int b2){
		String result = "Input khong hop le";
		if(isValidValue(a1, b1, a2, b2)){
			if( a1 != a2 && a1*a2 != -1){
				result = "Cat nhau";
				return result;
			}
			if(a1* a2 == -1){
				result = "Vuong goc";
				return result;
			}
			if(a1 == a2 && b1!= b2){
				result = "Song song";
				return result;
			}
			if(a1 == a2 && b1 == b2){
				result = "Trung nhau";
				return result;
			}
		}
		return result;
	}
}
