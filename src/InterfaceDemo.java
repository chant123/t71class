//接口是被用来确定框架的
interface Person1{
    String name =  "zhangsan";//interface中的变量是以常量的形式存在的，子类去覆写它并不能改变量
    
	//人这个模块，他有哪些操作，在interface中我只定义操作
	public abstract void eat();
	public abstract String drink();
	public abstract boolean sleep();
 	public abstract int work();
   	
}
interface Person2{
	public void fun();//既然接口都是抽象类，所以写不写abstract都没关系
}
//因为Person没有任何实现，所以需要子类来继承（如果是接口，把继承改名为implements）
class Male implements Person1,Person2{
	//interface可以实现多"继承"
    String name = "lisi";
	@Override
	public void eat() {
		System.out.println("吃饭");
		
	}

	@Override
	public String drink() {
		System.out.println("喝酒");
		return null;
	}

	@Override
	public boolean sleep() {
		System.out.println("睡不着觉");
		return false;
	}

	@Override
	public int work() {
		System.out.println("赚不到钱");
		return 0;
	}

	@Override
	public void fun() {
		System.out.println("真是一点都不好玩");
		
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
