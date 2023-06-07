package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		
//		;
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		//기존배열과 새로운 배열
		//기존에 있는거에다 복사?
		//dest 대상 //destPos 길이
//		System.arr
		
		for(int i=0; i<newStrArray.length;i++) {
			System.out.println(newStrArray[i]+", ");
		}
		System.out.println();
		System.out.println("Arrays");
		String[] arr = Arrays.copyOf(oldStrArray, 6); //리턴이 되고 있어
		//기존배열로 
		//용도가 다르다
		for (int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		//
		for (String s : arr) {
			System.out.println(s);
		}
		
	}

}
