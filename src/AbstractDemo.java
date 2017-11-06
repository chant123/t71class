abstract class People{
	private String name;
	public People(){
		System.out.println("抽象类的默认无参构造方法");
	}
	public People(String name){
		this.name = name;
		System.out.println("抽象类 的名称："+name);
	}
	abstract public String People();
	public void say(){
		System.out.println("");
	}
}







public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
