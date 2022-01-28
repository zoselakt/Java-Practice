package day_03;

import java.util.Arrays;

public class Array_04 {
	public static void main(String[] args) {
		// 배열의 복제
		// system.array(src, srcPos, dest, destPos, length);
		// src: 복사할 배열  / srcPos 복사 시작할 위치
		// dest: 덮어쓸 배열 / destPos: 덮어쓰기 시작할 위치
		// length: 복사할길이
		
		int [] a= {1,2,3,4,5,6};
		int [] b= {0,0,0,0,0,0,0};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		//복제
		System.arraycopy(a, 2, b, 3, 4);
//		System.arraycopy(src, srcpos, dest, destpos, length);
		
		System.out.println(Arrays.toString(b));

}}
