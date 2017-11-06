//如何定义类，类的标识class 类名称（首字母大写）
    //我们队一个功能点进行操作，都有输入，操作部分，输出
	//输入就是我们的属性，操作就是我们的方法
	//输出就是我们的打印结果或者返回值
/*class Baby{
	//记录新生儿的出生信息
	//需要记录的信息是：姓名，性别，年龄
	//将新生儿信息保存，此处不提保存到数据库，只是将保存的结果显示出来
	String name;
	private String sex;
	private int age; //年龄被私有化，意味着baby只能被x.setAge使用
	//因为只有操作的时候，才有操作结果，如果这个结果只是需要在页面上打印出来，那么直接用void
	//如果这个方法的操作结果是要给另一个方法（功能点）作为输入，那么我们需要使用return
     
	
	//一个文件中只能存在一个public类，这个类的类名称必须与文件名相同
	//其他的类，不能够加入public，用默认替代
	//其他地方，我们一般用public和private使用
	//我们在使用private只有在封装变量的时候使用
	Baby(){    
		//无参构造方法，做了一件事情，是输出一串内容
	   System.out.println("新宝宝出生了");
	 
	   
}
	
	  //因为我们小孩出生，带的信息比较多
	  //有些小孩出生，除了知道性别和出生日期（年龄），名字没想好
	public Baby(String sex,int age){
		   System.out.println("性别："+sex+"年龄："+age);
		   System.out.println("名字没想好");
	   }
	
	
	public void setAge(int age){
		if(age<0||age>100){
			System.out.println("年龄输入有误");
		}else{
		    this.age = age;//this.age表示属性的那个变化
		}
	}
	public void setSex(String b){
		if(b.equals("男")||b.equals("女")){
		    sex=b;
		}else{
			System.out.println("性别输入有误");
		}
			
	}
	public int getAge(){
		return age;
	}
	public String getSex(){
	   return sex;
	}
	public String save(){
		//把要保存的内容保存到数据库中
		//往数据库插入数据,insert into usertbl values(name,sex,age);
		//还需要将这个操作的结果，给到下一个模块或者操作使用，需要用到return返回
		return "姓名为："+name+"，性别为："+sex+"，年龄为："+age;
	}
	public void show(){
		//用来显示往数据库中保存了哪些数据
		System.out.println(save());
	}
}

public class SysInfo {
	public static void main(String[] args) {
		//左边是定义了一个X对象，是baby类型的
		//右边开除了空间，通过new来执行了构造方法
		Baby x = new Baby();
		Baby y = new Baby("男",1);
		x.name="xiapyang";
		x.setAge(10);
		x.setSex("女");
		String sex=x.getSex();
		int age = x.getAge();
		System.out.println(age);
		System.out.println(sex);
		x.show(); 
	}
}*/



//定义登录模块的使用方法
class Login{
	/*private*/ String username;
	/*private*/ String password;
	Login(){
		System.out.println("用户名和密码未输入");
	}
	public Login(String username,String password){
		System.out.println("用户名："+username+",密码："+password);
		this.username = username;
		this.password = password;
	}
	}
/*public void setUsername(String a){
	if(a.charAt(0)>='0'&&a.charAt(0)<='9'){
		System.out.println("用户名输入有误");
	}else{
		username = a;
	}
}
public void setPassword(String b){
	if(b.length()>5){
		password = b;
	}else{
		System.out.println("输入密码有误");
	}
}
public String getUsername(){
	return username;
}
public String getPassword(){
	return password;
}

public void login(){
	if(username.equals("admin") && password.equals("123456")){
		System.out.println("登陆成功!!");
	}else{
		System.out.println("登录失败!!");
	}
}
public void reset(){
	username = null;
	password = null;
}
}*/
public class SysInfo{
	public static void main(String[] args) {
		Login in1 = new Login();
		Login in2 = new Login("admin","123456");
		
		
		
		/*Login index = new Login();
		index.setUsername("jfdkjg");
		index.setPassword("1213378");
		System.out.println(index.getUsername());
		System.out.println(index.getPassword());*/
		//index.username = "admin";
		//index.password = "123456";
		//index.login();
		//---------另外一个用户使用admin,admin登录------------
		//相当于另外有一个用户，重新访问登录功能
		//系统产生了一个新的session，Login被再次实例化了
		//Login index2 = new Login();
		//index2.username = "admin";
		//index2.password = "admin";
		//index.login();
}
}
