class Enroll{
	String user;
	String pwd;
	String cpwd;
	String regName[] = {"admin","zhangsan","lisi"};

Enroll(String user,String pwd,String cpwd){
	this.user = user;
	this.pwd = pwd;
	this.cpwd = cpwd;
	/*if(chkUser()==true&&pwd == cpwd){
		boolean flag=false;
		for(int i=0;i<3;i++){
			if(regName[i] == user){
				flag=true;
			}
		}
		if(flag){
			System.out.println("该用户名已被注册");
		}else{
		System.out.println("注册成功");
		}
		
	}else{
		System.out.println("注册失败");
	}*/
}

public boolean chkUser(){
	boolean flag = false;
	if(user.length()>=3&&chkUser1()==false){
        flag = true;
	}else{
		flag = false;
	}
	return flag;
}
public boolean chkUser1(){
	boolean flag = false;
    for(int i=0;i<3;i++){
    	if(regName[i] == user){
    		flag=true;
    	}
    }
	return flag;
}
public boolean chkCpwd(){
	boolean flag = false;
	if(pwd == cpwd){
		flag = true;
	}else{
		flag = false;
	}
	return flag;
}
public void enroll(){
	if(chkUser()&&chkCpwd()){
		System.out.println("注册成功");
	}else{
		System.out.println("注册失败");
	}
}

}

public class Register {

	public static void main(String[] args) {
		String user = "admin1";
		String pwd = "123456";
		String cpwd = "123456";
		Enroll p1 = new Enroll(user,pwd,cpwd);
		p1.enroll();
		//Enroll p2 = new Enroll("zhansan","123456","123456");
	}
}
