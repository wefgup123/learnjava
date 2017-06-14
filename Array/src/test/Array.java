package test;
//java中没有引用传递
public class Array {

	public static void main(String[] args) {
	int array[] =  new int[3];
	int array1[] = new int[3];
	for(int i=0;i<3;i++){
		array[i] = i;
		System.out.println(array[i]);
	}
	
	for(int i=0;i<3;i++){//传递单个数组对象
		array1[i]=array[i];
		System.out.println(array1[i]);
	}
	//array1 = array;
	array1[0] = 1;
	for(int i=0;i<3;i++){
		System.out.println(array1[i]);
	}
	for(int i=0;i<3;i++){//不影响原值
		System.out.println(array[i]);
	}
	
	array1 = array;//传递数组引用
	array1[0] = 1;
	for(int i=0;i<3;i++){
		System.out.println(array1[i]);
	}
	for(int i=0;i<3;i++){//影响原值
		System.out.println(array[i]);
	}
	}

}
