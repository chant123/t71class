import lmy.Test;

class Person{
	//���췽����Ŀ����Ҫ��Ϊ��ʵ����һ�����󣬲����ܹ���ȡ�����롣
String name;
int age;
Person(){
	System.out.println("��ӭ�������ҵ�����!!!");
}
Person(String name){
	this();//�˴�ʵ����Person������ȫ�����ݡ�
	System.out.println("�������Ϊ��"+name);
}
Person(String name,int age){
	this(name);//�˴�ʵ����Person��name����ȫ�����ݡ�
	System.out.println(" ����Ϊ��"+age);
}
 
}

public class This {

	public static void main(String[] args) {
       Person index = new Person();
       Person index1 = new Person("lisi");
       Person index2 = new Person("zhangsan",17);
       //����ô�������ֻ��Ҫ���벻ͬ�Ĳ�������������Ҫ�������ƣ����������ÿ����߲��ü���̫�ණ����
       Test t = new Test();
	}

}
