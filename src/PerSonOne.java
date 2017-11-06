class Person4{
String name = "hunan";
public String say(){
return "hello";
}
}
class Person3 extends Person4{
String name = "changsha";
public String say(){
//使用super.say()是继承自父类的say方法
//super关键字也可以调用父类变量
return "welcome to "+super.name;
}
}
public class PerSonOne {

	public static void main(String[] args) {
		Person4 p1 = new Person4();
		Person3 p2 = new Person3();
		System.out.println(p1.say());
		System.out.println(p2.say());
	}
}
