//�ӿ��Ǳ�����ȷ����ܵ�
interface Person1{
    String name =  "zhangsan";//interface�еı������Գ�������ʽ���ڵģ�����ȥ��д�������ܸı���
    
	//�����ģ�飬������Щ��������interface����ֻ�������
	public abstract void eat();
	public abstract String drink();
	public abstract boolean sleep();
 	public abstract int work();
   	
}
interface Person2{
	public void fun();//��Ȼ�ӿڶ��ǳ����࣬����д��дabstract��û��ϵ
}
//��ΪPersonû���κ�ʵ�֣�������Ҫ�������̳У�����ǽӿڣ��Ѽ̳и���Ϊimplements��
class Male implements Person1,Person2{
	//interface����ʵ�ֶ�"�̳�"
    String name = "lisi";
	@Override
	public void eat() {
		System.out.println("�Է�");
		
	}

	@Override
	public String drink() {
		System.out.println("�Ⱦ�");
		return null;
	}

	@Override
	public boolean sleep() {
		System.out.println("˯���ž�");
		return false;
	}

	@Override
	public int work() {
		System.out.println("׬����Ǯ");
		return 0;
	}

	@Override
	public void fun() {
		System.out.println("����һ�㶼������");
		
	}
	Male(){
		this.eat();
		this.drink();
		this.sleep();
		this.work();
		this.fun();
	}
	
}

public class InterfaceDemo {
	
	public static void main(String[] args) {
		Person1 p1 = new Male();
		System.out.println(p1.name );

	}

}
