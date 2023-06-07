package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		int[] arr1; //변수뒤에있던 타입뒤에있던 대괄호가 있으면 배열 int arr1[] 여긴 일단 선언만 함
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1,2,3}; //초기화 객체처럼 new
		arr2 = new int[] {1,2,3};
		arr3 = arr2; // 그 안에 있는 값이 저장돼있는 주소값이 저장
		
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);
		
		//기본자료형
		int a = 1; //이변수에 값자체가
		int b = a; //1이 들어간것 a가 아니라 두개는 별개 에이비
		b = 2;
		System.out.println(a);
		
		//참조자료형
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		arr1[0] = 4;
		System.out.println(arr2[0]); //별개임
		arr3[0] = 4; //같은곳을 가리키고 있기때문에 메모리값이 4 2 3 으로 바껴있기때문에
		System.out.println(arr2[0]); //주소를 저장하고 있기 때문에
		//참조자료형이기 때문에
	}

}
