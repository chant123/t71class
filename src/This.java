import lmy.Test;

class Person{
	//构造方法的目的主要是为了实例化一个对象，并且能够获取到输入。
String name;
int age;
Person(){
	System.out.println("欢迎回来，我的朋友!!!");
}
Person(String name){
	this();//此处实现了Person（）的全部内容。
	System.out.println("你的姓名为："+name);
}
Person(String name,int age){
	this(name);//此处实现了Person（name）的全部内容。
	System.out.println(" 年龄为："+age);
}
 
}

public class This {

	public static void main(String[] args) {
       Person index = new Person();
       Person index1 = new Person("lisi");
       Person index2 = new Person("zhangsan",17);
       //这个好处在于我只需要输入不同的参数个数，不需要记忆名称，这样可以让开发者不用记忆太多东西。
       Test t = new Test();
	}

}
