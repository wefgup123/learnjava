package test;
//java��û�����ô���
public class Array {

	public static void main(String[] args) {
	int array[] =  new int[3];
	int array1[] = new int[3];
	for(int i=0;i<3;i++){
		array[i] = i;
		System.out.println(array[i]);
	}
	
	for(int i=0;i<3;i++){//���ݵ����������
		array1[i]=array[i];
		System.out.println(array1[i]);
	}
	//array1 = array;
	array1[0] = 1;
	for(int i=0;i<3;i++){
		System.out.println(array1[i]);
	}
	for(int i=0;i<3;i++){//��Ӱ��ԭֵ
		System.out.println(array[i]);
	}
	
	array1 = array;//������������
	array1[0] = 1;
	for(int i=0;i<3;i++){
		System.out.println(array1[i]);
	}
	for(int i=0;i<3;i++){//Ӱ��ԭֵ
		System.out.println(array[i]);
	}
	}

}
