
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {
	public static void main(String[] args){
		List<String> students = new ArrayList<String>();
	
		students.add("����");
		students.add("����");
		students.add("����");
		students.add("����");
		students.add("����");
		
		int size = students.size();
		System.out.println("ѧ������Ϊ��"+size);
		
		for(int i=0;i<size;i++){
			System.out.println(students.get(i));
		}
		
		System.out.println("ʹ��for�ĵڶ����÷���������");
		for(String name:students){
			System.out.println(name);
		}
		
		//����3
		System.out.println(students.toString());
		 
		//�Ƴ�
		students.remove(0);
		students.remove("����");
		System.out.println("�Ƴ�֮��Ľ����"+students.toString());
		
		//����
		boolean flag = students.contains("����");
		if(flag){
			System.out.println("����һ���������ѧ��");
		}else{
			System.out.println("�����ڽ������ѧ��");
		}
		
		//���Ƶ�һ��������
		String[] names = new String[5];
		students.toArray(names);
		System.out.println(Arrays.toString(names));
		
		//���
		students.clear();
		System.out.println("���֮�������Ϊ��"+students.toString());
		
	}

}
