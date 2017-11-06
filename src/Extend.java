class C1{
	C1(){
		//System.out.println("Father的构造方法");
	}
public void fun1(){
		System.out.println("父类的fun1方法");
	}
public void fun2(){
	System.out.println("父类的fun2方法");
}
}
class C2 extends C1{
	C2(){
		//System.out.println("Son的构造方法");
	}
	 public void fun1(){
			System.out.println("子类的fun1方法");
		}
	 public void fun3(){
			System.out.println("子类的fun3方法");
		}
	
	
}


public class Extend {

	public static void main(String[] args) {
		C1 c1 = new C2();
		C2 c21 = (C2)c1;
		//System.out.println(c1 instanceof C1);
		//System.out.println(c1 instanceof C2);
		//System.out.println(c21 instanceof C2);
		//System.out.println(c21 instanceof C1);
		c1.fun1();
		c1.fun2();
		c21.fun1();
		c21.fun2();
		c21.fun3();
	}

}
