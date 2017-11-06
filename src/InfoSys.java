
class Enroll1{
	String user;
	String pwd;
	String cpwd;
	String regName[] = {"admin","zhangsan","lisi"};

Enroll1(String user,String pwd,String cpwd){
	this.user = user;
	this.pwd = pwd;
	this.cpwd =cpwd;
	
	if(this.chkUser()&&pwd == cpwd){
		boolean flag=false;
		for(int i=0;i<3;i++){
			if(regName[i] == user){
				flag=true;
			}
		}
		if(flag==false){
			System.out.println("注册成功");
		}else{
			System.out.println("此用户名已注册");
		}
	}else{
		System.out.println("注册失败");
	}
}

public boolean chkUser(){
	boolean flag = false;
	if(user.length()>=3){
		flag = true;
	}else{
		flag = false;
	}
	return flag;
}
/*public boolean chkUser1(){
	boolean flag = false;
	for(int i=0;i<3;i++){
		if(regName[i] == user){
			flag = false;
		}else{
			flag = true;
		}
	}
	return flag;
}*/

}

public class InfoSys{

	public static void main(String[] args) {
		
		Enroll1 p1 = new Enroll1("zhangsan","123456","123456");
	}


}
