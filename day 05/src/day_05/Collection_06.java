package day_05;

public class Collection_06 {
	public static void main(String[] args) {
		// 정렬(sort) : 데이터를 순서대로 나열하기 위한 절차적인 과정 
		// 1. 선택정렬: 최소값 혹은 최대값을 선택해서 가장 앞에다가 위치하여 선택할 위치를 이동하며 정렬하는 방법
		// 2. 삽입정렬: 지정한 값의 삽입할 위치를 찾아 정렬하는 방법
		// 3. 버블정렬: 인접한 두수를 비교해서 큰 수를 뒤로 보내는 알고리즘
		
		// 1. 선택정렬: 최소값 혹은 최대값을 선택해서 가장 앞에다가 위치하여 선택할 위치를 이동하며 정렬하는 방법
		// 구현은 쉬우나 다른 정렬에 비해 시간이 오래걸린다.
		// 기본로직
		// ㄱ. 정렬되지 않은 인덱스의 맨 앞에서부터 이를 포함한 그 이후의 값 중 가장 작은 값을 찾아간다.
		// ㄴ. 가장 작은값을 찾으면 그 값을 현재 인덱스의 값과 바꿔준다.
		// ㄷ. 다음 인덱스로 이동하여 위 과정을 반복한다.
		
		int min, tmp;
		int ar[] = {8,1,2,5,4,3,6,7};
		for(int i=0; i<ar.length-1; i++) {
			min = i;
			for(int j=i+1; j<ar.length; j++) {
				if(ar[min] > ar[j]) {
					tmp = ar[min];
					ar[min] = ar[j];
					ar[j] =tmp;
				}
			}
		}
		System.out.println("정렬 작업 완료!");
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i] + " " );
		}
		System.out.println("\n---------------------------");
		
		// 2. 삽입정렬: 지정한 값의 삽입할 위치를 찾아 정렬하는 방법
		// ㄱ. 삽입정렬은 두번째 인덱스부터 시작
		// ㄴ. 현재 인덱스는 별도의 변수의 저장
		// ㄷ. 비교인덱스 = 현재인덱스 -1
		// ㄹ. 인덱스값 < 비교 인덱스의 값:
		// ㅁ. 인덱스 > 비교 인덱스의 값: 비교 인덱스--
		
		int ar1[] = {8,1,2,5,4,3,6,7};
		int idx, tmp1;

		for(int i=1; i<ar1.length; i++) {
			idx = i;
			for(int j=i-1; j>=0; j--) {
				if(ar1[j] > ar1[idx]) {
					tmp1 = ar1[j];
					ar1[j] = ar1[idx];
					ar1[idx] = tmp1;
					idx = j;
				}
				else{
					break;
				}
			}
		}
		System.out.println("정렬작업완료!");
		for(int i=0; i<ar1.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println("\n---------------------------");
		
		// 3. 버블정렬: 인접한 두 수를 비교해서 큰 수를 뒤로 보내는 알고리즘, 정렬과정이 거품이 일어나는 것과 비슷하다 하여 버블!
		// 구현이 쉽고 코드가 직관적이다, 단점은 시간이 오래걸린다
		
		int ar2[] = {6,4,7,9,1,2,8,3,5};
		
		for(int i=ar2.length-1; i>=0; i--) {
			for(int j=0; j<i; j++) {
				if(ar2[j] > ar2[j+1]) {
					tmp = ar2[j];
					ar2[j] = ar2[j+1];
					ar2[j+1] =tmp;
				}
			}
		}
		System.out.println("정렬작업완료!");
		for(int i=0; i<ar2.length; i++) {
			System.out.print(ar2[i] + " ");
		}
		
				
	}
}
